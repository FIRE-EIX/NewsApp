package com.example.newsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.newsapp.json.NewsBean;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsFragment extends Fragment {
    private FloatingActionButton fab;
    private ListView listView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private List<NewsBean.Re.DataBean> list;
    private static final int UPNEWS_INSERT = 0;
    private int page = 0, row = 10;
    private static final int SELECT_REFLSH = 1;
    String responseDate;
    @SuppressLint("HandlerLeak")
    private Handler newsHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPNEWS_INSERT:
                    list = ((NewsBean) msg.obj).getResult().getData();
                    MyTabAdapter adapter = new MyTabAdapter(getActivity(), list);
                    listView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    break;
                case SELECT_REFLSH:
                    list = ((NewsBean) msg.obj).getResult().getData();
                    MyTabAdapter myTabAdapter = new MyTabAdapter(getActivity(), list);
                    listView.setAdapter(myTabAdapter);
                    myTabAdapter.notifyDataSetChanged();
                    if (swipeRefreshLayout.isRefreshing()) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_item, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
        return view;
    }

    @SuppressLint("HandlerLeak")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        onAttach(getActivity());
        //获取传递的值
        Bundle bundle = getArguments();
        final String data = bundle.getString("name", "top");
        //置顶功能
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.smoothScrollToPosition(0);
            }
        });
        //下拉刷新
        swipeRefreshLayout.setColorSchemeResources(R.color.colorRed);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                page++;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 1000);
            }
        });
        //异步加载数据
        getDataFromNet(data);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //获取点击条目的路径，传值显示webview页面
                String url = list.get(position).getUrl();
                String uniquekey = list.get(position).getUniquekey();
                final NewsBean.Re.DataBean dataBean = (NewsBean.Re.DataBean) list.get(position);
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra("url", url);
                intent.putExtra("uniquekey", uniquekey);
                startActivity(intent);
            }
        });
    }

    private void getDataFromNet(final String data) {
        final String path = "http://v.juhe.cn/toutiao/index?type=" + data + "&key=e0f178fabf739a63d2ec20a25cd82ede";
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(path)
                        .build();

                try {
                    Response response = okHttpClient.newCall(request).execute();
                    responseDate = response.body().string();
                    NewsBean newsBean = new Gson().fromJson(responseDate, NewsBean.class);
                    //如果每天免费次数用完后，根据错误code加载数据库新闻数据
                    if ("10012".equals("" + newsBean.getError_code())) {
                        List<NewsBean.Re.DataBean> listDataBean = new ArrayList<>();
                        System.out.println("当没有次数的时候获取到的标题内容:" + data);
                        BmobQuery<NewsBean.Re.DataBean> query = new BmobQuery<NewsBean.Re.DataBean>();
                        query.addWhereEqualTo("category", data);
                        query.findObjects(new FindListener<NewsBean.Re.DataBean>() {
                            @Override
                            public void done(List<NewsBean.Re.DataBean> object, BmobException e) {
                                if (e == null) {
                                    newsBean.setResult(new NewsBean.Re());
                                    newsBean.getResult().setData(object);
                                } else {
                                    Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                                }
                            }
                        });

                    }
                    //解析得到的请求到的对应标题的新闻数据json
                    JSONObject jsonObject = null;
                    try {
                        jsonObject = new JSONObject(responseDate);
                        JSONObject jsonObject1 = jsonObject.getJSONObject("result");
                        JSONArray jsonArray = jsonObject1.getJSONArray("data");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                            //这里是在新闻类别的点击事件中添加一个插入新闻的具体json数据到news_info表中
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    DataBean news = new DataBean();
                                    try {
                                        news.setAuthor_name(jsonObject2.getString("author_name"));
                                        news.setCategory(jsonObject2.getString("category"));
                                        news.setDate(jsonObject2.getString("date"));
                                        news.setUniquekey(jsonObject2.getString("uniquekey"));
                                        news.setTitle(jsonObject2.getString("title"));
                                        news.setThumbnail_pic_s(jsonObject2.getString("thumbnail_pic_s"));
                                        news.setThumbnail_pic_s02(jsonObject2.getString("thumbnail_pic_s02"));
                                        news.setThumbnail_pic_s03(jsonObject2.getString("thumbnail_pic_s03"));
                                        news.setUrl(jsonObject2.getString("url"));
                                        news.save(new SaveListener<String>() {
                                            @Override
                                            public void done(String objectId, BmobException e) {
                                                if (e == null) {

                                                } else {

                                                }
                                            }
                                        });
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }).start();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Message msg = newsHandler.obtainMessage();
                    msg.what = UPNEWS_INSERT;
                    msg.obj = newsBean;
                    newsHandler.sendMessage(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    private String streamToString(InputStream inputStream, String charset) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            StringBuilder builder = new StringBuilder();
            while ((s = bufferedReader.readLine()) != null) {
                builder.append(s);
            }
            bufferedReader.close();
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}
