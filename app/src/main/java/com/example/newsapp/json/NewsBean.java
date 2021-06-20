package com.example.newsapp.json;

import java.io.Serializable;
import java.util.List;

import cn.bmob.v3.BmobObject;

public class NewsBean implements Serializable {

    /**
     * reason : success!
     * result : {"stat":"1","data":[{"uniquekey":"84a41671e7f594c6537eabb36ecdb764","title":"绥宁：暖心！黄土矿镇党员干部帮村民抢收40余亩油菜籽","date":"2021-05-26 09:33:00","category":"头条","author_name":"大公湖南","url":"https://mini.eastday.com/mobile/210526093335341631051.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"439f92a54e87b900486b559756d5d97b","title":"飞天、千佛、九色鹿\u2026\u2026在上海见证\u201c玉见敦煌\u201d","date":"2021-05-26 09:21:00","category":"头条","author_name":"澎湃新闻","url":"https://mini.eastday.com/mobile/210526092107134652441.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"5dd38546b1ed51656eaa039d47c15469","title":"交通事故致老人受伤 淮阳交警暖心救助获赞","date":"2021-05-26 09:20:00","category":"头条","author_name":"映象网","url":"https://mini.eastday.com/mobile/210526092041864663192.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092041_cd6dd90121c3df06c811fa4b7d64242f_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092041_cd6dd90121c3df06c811fa4b7d64242f_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"27b81ad1b7c15f84f0d861f1fbce517a","title":"男子还债伪造车辆手续 抵押贷款近百万元","date":"2021-05-26 09:18:00","category":"头条","author_name":"东北网","url":"https://mini.eastday.com/mobile/210526091835973772074.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091835_db8ac81080214b07ad2eea1671957628_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091835_db8ac81080214b07ad2eea1671957628_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1345bde22689a4ca5ce806209b61eb77","title":"男子驾车高速飞驰竟是无证 自认为技术成熟","date":"2021-05-26 09:13:00","category":"头条","author_name":"四川新闻网","url":"https://mini.eastday.com/mobile/210526091334589548121.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091334_6a8858887b0ff154bf9942f1818bfe55_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"6ca12f7ef139511fe7a26f379e0410b9","title":"太机智了！小伙误入传销，银行柜台前冲工作人员\u201c竖中指\u201d，反倒救了他一命！","date":"2021-05-26 09:09:00","category":"头条","author_name":"北晚新视觉","url":"https://mini.eastday.com/mobile/210526090959741165054.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"dfef492a533554bf57b8b3f567eb1209","title":"远东控股入选\u201c无锡市智能工厂\u201d，看远东智造如何成为行业标杆？","date":"2021-05-26 09:09:00","category":"头条","author_name":"汇点科技","url":"https://mini.eastday.com/mobile/210526090928243408313.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a2fa64bccc91b4bfc75d2cf0354e8934","title":"【生活课堂】公共安全知识及防护指南","date":"2021-05-26 09:05:00","category":"头条","author_name":"每日甘肃网-甘肃日报","url":"https://mini.eastday.com/mobile/210526090541532294927.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"dde16a8f3bc2710a603f3b2a89de11ef","title":"财经早班车|发改委：深入推进价格改革，完善价格调控机制","date":"2021-05-26 09:04:00","category":"头条","author_name":"新民晚报","url":"https://mini.eastday.com/mobile/210526090408033204333.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090408_b3cd9ff142355e2dea62976a9fb67d1f_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a67e08825fd70b3f80d6037d6652ed6d","title":"杨浦社区医生送\u201c苗\u201d上门，为养老院里的\u201c80后\u201d筑起防疫墙","date":"2021-05-26 09:04:00","category":"头条","author_name":"新民晚报","url":"https://mini.eastday.com/mobile/210526090405972929417.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090405_501ee8d389e48e97b7f2add9993ec459_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"79f20b3c9c4367010364d993ff56e0fe","title":"喜讯！松江3家企业获颁跨国公司地区总部和研发中心证书","date":"2021-05-26 08:50:00","category":"头条","author_name":"上海松江","url":"https://mini.eastday.com/mobile/210526085032081827046.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526085032_e5e52f4965214b1fd216d9cc811c3414_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526085032_e5e52f4965214b1fd216d9cc811c3414_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"ee9ead4c7aa0decd853f04dc423e3c83","title":"美好生活 金色童年\u2014\u2014枣庄滕州实验小学荆河路校区\u201c庆六一\u201d校园书画摄影手抄报作品展顺利开展","date":"2021-05-26 08:48:00","category":"头条","author_name":"鲁网枣庄","url":"https://mini.eastday.com/mobile/210526084844024128380.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084844_4706c7dd9b0e3150c87344ab3c7865cb_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084844_4706c7dd9b0e3150c87344ab3c7865cb_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"15c7d23830e47893e4f9f939042422de","title":"今天，送别吴孟超院士！","date":"2021-05-26 08:41:00","category":"头条","author_name":"星辰在线","url":"https://mini.eastday.com/mobile/210526084115865498326.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2206aab6987a982c2eda8dc41ae44294","title":"山东:虚假诉讼\"套路\"挺多 深查细究真相露了","date":"2021-05-26 08:40:00","category":"头条","author_name":"中国青年网","url":"https://mini.eastday.com/mobile/210526084058792222597.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084058_7fa6c9085bf06d4b4854e8792c5f3d03_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1d8898a6db95ab2337740cb13ae124c4","title":"华坪女子高中校长张桂梅，缩衣节食为学生，我们都欠你一个感动？","date":"2021-05-26 08:39:00","category":"头条","author_name":"雅博教育","url":"https://mini.eastday.com/mobile/210526083959042186513.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f0002074b50ef552872dacca3c37a80a","title":"太突然！上海师大取消30多名研究生拟录取资格！学校深夜通报","date":"2021-05-26 08:39:00","category":"头条","author_name":"环球网","url":"https://mini.eastday.com/mobile/210526083914199770400.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2573a4acbff586c61fc9a2a233959282","title":"河南两老虎咬死饲养员后被击毙，县委书记回应：县里没有麻醉枪，武警无奈之下开枪","date":"2021-05-26 08:38:00","category":"头条","author_name":"上游新闻","url":"https://mini.eastday.com/mobile/210526083848507881379.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083848_50098faab8e43a9acfe7d530602f86fd_2_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083848_50098faab8e43a9acfe7d530602f86fd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"109293746e3733d654fbff8f4d3e7ce4","title":"白银越野赛最后一位退赛选手：跑到晚上8点多，才被强制终止比赛，上车就哭着打电话","date":"2021-05-26 08:38:00","category":"头条","author_name":"北京青年报","url":"https://mini.eastday.com/mobile/210526083838419495975.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_4_mwpm_03201609.png","is_content":"1"},{"uniquekey":"30f788259a0f149b285ab8ae32277f0f","title":"【图片新闻】初夏时节 会宁县城绿意盎然","date":"2021-05-26 08:35:00","category":"头条","author_name":"每日甘肃网-甘肃日报","url":"https://mini.eastday.com/mobile/210526083514575235253.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083514_649575e8d5c222f46dcfdad2050933b1_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"55d93e0ce93235f485bb34390c99cca8","title":"视频｜老人地铁站走失 民警用\u201c实景地图\u201d帮她回家","date":"2021-05-26 08:33:00","category":"头条","author_name":"看看新闻网","url":"https://mini.eastday.com/mobile/210526083344435647684.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"63320719f55bde51b625981abfb7ae57","title":"违规采集个人信息 第二批30款App被厦门警方曝光","date":"2021-05-26 08:32:00","category":"头条","author_name":"东南网","url":"https://mini.eastday.com/mobile/210526083208143431141.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083208_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"119e588e0c63a78b3cd65a4acb017d01","title":"【给派出所送披锦旗的羊，派出所副所长：同意收下锦旗，但羊坚决不能收】","date":"2021-05-26 05:00:00","category":"头条","author_name":"36氪","url":"https://mini.eastday.com/mobile/210526050003636843720.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526050003_3fd7c0341c9f4ea05a24ebabdc8f9a28_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"e3d6cd55d6167a507ad422d468e8fcb4","title":"广东又将迎来新地铁，投资约211亿，长约25公里，预计2023年运营","date":"2021-05-26 02:07:00","category":"头条","author_name":"春燕洁教你玩游戏","url":"https://mini.eastday.com/mobile/210526020700828358078.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"83cdab3f1695a60d40234741fef063f0","title":"老板买百辆汽车送员工当年终奖，交车时员工心寒了","date":"2021-05-26 00:43:00","category":"头条","author_name":"小琳儿看星","url":"https://mini.eastday.com/mobile/210526004311084179731.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7b908210b160d8bba1782e0bad063224","title":"\u201c扣好人生第一粒扣子庆，红领巾心向党\u201d\u2014\u2014共青团花垣县委庆六一主题活动","date":"2021-05-26 00:40:00","category":"头条","author_name":"花垣视窗","url":"https://mini.eastday.com/mobile/210526004022194742179.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f34effd7c620e739b1e0e37ea307f75f","title":"河南南阳66岁男子持棍行凶 致12名学生2名群众受伤","date":"2021-05-26 00:32:00","category":"头条","author_name":"中国新闻网","url":"https://mini.eastday.com/mobile/210526003234942372236.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526003234_50ce8e1a416d9bf02b4ca6e73e89e411_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"c129156b7649b60c69df173df4f6e4ef","title":"来宁游玩与儿子走散 母亲爬数百级台阶寻找累到虚脱","date":"2021-05-26 00:17:00","category":"头条","author_name":"","url":"https://mini.eastday.com/mobile/210526001702685994832.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001702_a7a67511b95f52d8ec13b068b29b9a42_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2f243de14109c27a661e9c96021236fa","title":"七旬老人身体不适要摔倒 路人见状一把扶住","date":"2021-05-26 00:16:00","category":"头条","author_name":"","url":"https://mini.eastday.com/mobile/210526001659137273338.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001659_7105b9fc10f3d7ff2582d703728120db_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"ad9313f4a60b7ba205aa947e141ed21b","title":"海汕记浅析经营火锅店如何存活并持续盈利","date":"2021-05-26 00:15:00","category":"头条","author_name":"海汕记餐饮","url":"https://mini.eastday.com/mobile/210526001534467602939.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"10e266adb633bf3238dad15d8fd91a0e","title":"解读 | 市场监管总局强化检验检测监管工作取得成效","date":"2021-05-26 00:14:00","category":"头条","author_name":"京津冀消息通","url":"https://mini.eastday.com/mobile/210526001403571446269.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001403_70b18bc8fe06bc3c80ccff8d6cee0245_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001403_70b18bc8fe06bc3c80ccff8d6cee0245_2_mwpm_03201609.jpeg","is_content":"1"}],"page":"1","pageSize":"30"}
     * error_code : 0
     */

    private String reason;
    private Re result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Re getResult() {
        return result;
    }

    public void setResult(Re result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class Re implements Serializable {
        /**
         * stat : 1
         * data : [{"uniquekey":"84a41671e7f594c6537eabb36ecdb764","title":"绥宁：暖心！黄土矿镇党员干部帮村民抢收40余亩油菜籽","date":"2021-05-26 09:33:00","category":"头条","author_name":"大公湖南","url":"https://mini.eastday.com/mobile/210526093335341631051.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"439f92a54e87b900486b559756d5d97b","title":"飞天、千佛、九色鹿\u2026\u2026在上海见证\u201c玉见敦煌\u201d","date":"2021-05-26 09:21:00","category":"头条","author_name":"澎湃新闻","url":"https://mini.eastday.com/mobile/210526092107134652441.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"5dd38546b1ed51656eaa039d47c15469","title":"交通事故致老人受伤 淮阳交警暖心救助获赞","date":"2021-05-26 09:20:00","category":"头条","author_name":"映象网","url":"https://mini.eastday.com/mobile/210526092041864663192.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092041_cd6dd90121c3df06c811fa4b7d64242f_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526092041_cd6dd90121c3df06c811fa4b7d64242f_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"27b81ad1b7c15f84f0d861f1fbce517a","title":"男子还债伪造车辆手续 抵押贷款近百万元","date":"2021-05-26 09:18:00","category":"头条","author_name":"东北网","url":"https://mini.eastday.com/mobile/210526091835973772074.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091835_db8ac81080214b07ad2eea1671957628_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091835_db8ac81080214b07ad2eea1671957628_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1345bde22689a4ca5ce806209b61eb77","title":"男子驾车高速飞驰竟是无证 自认为技术成熟","date":"2021-05-26 09:13:00","category":"头条","author_name":"四川新闻网","url":"https://mini.eastday.com/mobile/210526091334589548121.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526091334_6a8858887b0ff154bf9942f1818bfe55_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"6ca12f7ef139511fe7a26f379e0410b9","title":"太机智了！小伙误入传销，银行柜台前冲工作人员\u201c竖中指\u201d，反倒救了他一命！","date":"2021-05-26 09:09:00","category":"头条","author_name":"北晚新视觉","url":"https://mini.eastday.com/mobile/210526090959741165054.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090959_60e375e04ab89aaa2c020fd3707638da_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"dfef492a533554bf57b8b3f567eb1209","title":"远东控股入选\u201c无锡市智能工厂\u201d，看远东智造如何成为行业标杆？","date":"2021-05-26 09:09:00","category":"头条","author_name":"汇点科技","url":"https://mini.eastday.com/mobile/210526090928243408313.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090928_f22959e1adab26ffea0f504d3d4fd698_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a2fa64bccc91b4bfc75d2cf0354e8934","title":"【生活课堂】公共安全知识及防护指南","date":"2021-05-26 09:05:00","category":"头条","author_name":"每日甘肃网-甘肃日报","url":"https://mini.eastday.com/mobile/210526090541532294927.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090541_9e25310a2d5766d5e5f887e9ffbcbfd4_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"dde16a8f3bc2710a603f3b2a89de11ef","title":"财经早班车|发改委：深入推进价格改革，完善价格调控机制","date":"2021-05-26 09:04:00","category":"头条","author_name":"新民晚报","url":"https://mini.eastday.com/mobile/210526090408033204333.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090408_b3cd9ff142355e2dea62976a9fb67d1f_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a67e08825fd70b3f80d6037d6652ed6d","title":"杨浦社区医生送\u201c苗\u201d上门，为养老院里的\u201c80后\u201d筑起防疫墙","date":"2021-05-26 09:04:00","category":"头条","author_name":"新民晚报","url":"https://mini.eastday.com/mobile/210526090405972929417.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526090405_501ee8d389e48e97b7f2add9993ec459_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"79f20b3c9c4367010364d993ff56e0fe","title":"喜讯！松江3家企业获颁跨国公司地区总部和研发中心证书","date":"2021-05-26 08:50:00","category":"头条","author_name":"上海松江","url":"https://mini.eastday.com/mobile/210526085032081827046.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526085032_e5e52f4965214b1fd216d9cc811c3414_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526085032_e5e52f4965214b1fd216d9cc811c3414_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"ee9ead4c7aa0decd853f04dc423e3c83","title":"美好生活 金色童年\u2014\u2014枣庄滕州实验小学荆河路校区\u201c庆六一\u201d校园书画摄影手抄报作品展顺利开展","date":"2021-05-26 08:48:00","category":"头条","author_name":"鲁网枣庄","url":"https://mini.eastday.com/mobile/210526084844024128380.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084844_4706c7dd9b0e3150c87344ab3c7865cb_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084844_4706c7dd9b0e3150c87344ab3c7865cb_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"15c7d23830e47893e4f9f939042422de","title":"今天，送别吴孟超院士！","date":"2021-05-26 08:41:00","category":"头条","author_name":"星辰在线","url":"https://mini.eastday.com/mobile/210526084115865498326.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084115_1ef219892b0f5087514934fb6aa92a84_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2206aab6987a982c2eda8dc41ae44294","title":"山东:虚假诉讼\"套路\"挺多 深查细究真相露了","date":"2021-05-26 08:40:00","category":"头条","author_name":"中国青年网","url":"https://mini.eastday.com/mobile/210526084058792222597.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526084058_7fa6c9085bf06d4b4854e8792c5f3d03_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1d8898a6db95ab2337740cb13ae124c4","title":"华坪女子高中校长张桂梅，缩衣节食为学生，我们都欠你一个感动？","date":"2021-05-26 08:39:00","category":"头条","author_name":"雅博教育","url":"https://mini.eastday.com/mobile/210526083959042186513.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083959_24c58507926ea1bdc3dbe8e96b3ab1c2_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f0002074b50ef552872dacca3c37a80a","title":"太突然！上海师大取消30多名研究生拟录取资格！学校深夜通报","date":"2021-05-26 08:39:00","category":"头条","author_name":"环球网","url":"https://mini.eastday.com/mobile/210526083914199770400.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083914_3e3a6979ae112ea78d646262942df9db_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2573a4acbff586c61fc9a2a233959282","title":"河南两老虎咬死饲养员后被击毙，县委书记回应：县里没有麻醉枪，武警无奈之下开枪","date":"2021-05-26 08:38:00","category":"头条","author_name":"上游新闻","url":"https://mini.eastday.com/mobile/210526083848507881379.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083848_50098faab8e43a9acfe7d530602f86fd_2_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083848_50098faab8e43a9acfe7d530602f86fd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"109293746e3733d654fbff8f4d3e7ce4","title":"白银越野赛最后一位退赛选手：跑到晚上8点多，才被强制终止比赛，上车就哭着打电话","date":"2021-05-26 08:38:00","category":"头条","author_name":"北京青年报","url":"https://mini.eastday.com/mobile/210526083838419495975.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083838_5f0753dbd6a3473ca1ed5f02f9e6acee_4_mwpm_03201609.png","is_content":"1"},{"uniquekey":"30f788259a0f149b285ab8ae32277f0f","title":"【图片新闻】初夏时节 会宁县城绿意盎然","date":"2021-05-26 08:35:00","category":"头条","author_name":"每日甘肃网-甘肃日报","url":"https://mini.eastday.com/mobile/210526083514575235253.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083514_649575e8d5c222f46dcfdad2050933b1_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"55d93e0ce93235f485bb34390c99cca8","title":"视频｜老人地铁站走失 民警用\u201c实景地图\u201d帮她回家","date":"2021-05-26 08:33:00","category":"头条","author_name":"看看新闻网","url":"https://mini.eastday.com/mobile/210526083344435647684.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083344_9a46cdd9069dc3780b6567d49829a1ac_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"63320719f55bde51b625981abfb7ae57","title":"违规采集个人信息 第二批30款App被厦门警方曝光","date":"2021-05-26 08:32:00","category":"头条","author_name":"东南网","url":"https://mini.eastday.com/mobile/210526083208143431141.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526083208_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"119e588e0c63a78b3cd65a4acb017d01","title":"【给派出所送披锦旗的羊，派出所副所长：同意收下锦旗，但羊坚决不能收】","date":"2021-05-26 05:00:00","category":"头条","author_name":"36氪","url":"https://mini.eastday.com/mobile/210526050003636843720.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526050003_3fd7c0341c9f4ea05a24ebabdc8f9a28_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"e3d6cd55d6167a507ad422d468e8fcb4","title":"广东又将迎来新地铁，投资约211亿，长约25公里，预计2023年运营","date":"2021-05-26 02:07:00","category":"头条","author_name":"春燕洁教你玩游戏","url":"https://mini.eastday.com/mobile/210526020700828358078.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526020700_9fc371596567bb94ec8fd7e3302c54ec_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"83cdab3f1695a60d40234741fef063f0","title":"老板买百辆汽车送员工当年终奖，交车时员工心寒了","date":"2021-05-26 00:43:00","category":"头条","author_name":"小琳儿看星","url":"https://mini.eastday.com/mobile/210526004311084179731.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004311_1ad12f5169ee03938832fd352d0aac83_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7b908210b160d8bba1782e0bad063224","title":"\u201c扣好人生第一粒扣子庆，红领巾心向党\u201d\u2014\u2014共青团花垣县委庆六一主题活动","date":"2021-05-26 00:40:00","category":"头条","author_name":"花垣视窗","url":"https://mini.eastday.com/mobile/210526004022194742179.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526004022_9e3e1c65dc24a285124b485b5a81adcd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f34effd7c620e739b1e0e37ea307f75f","title":"河南南阳66岁男子持棍行凶 致12名学生2名群众受伤","date":"2021-05-26 00:32:00","category":"头条","author_name":"中国新闻网","url":"https://mini.eastday.com/mobile/210526003234942372236.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526003234_50ce8e1a416d9bf02b4ca6e73e89e411_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"c129156b7649b60c69df173df4f6e4ef","title":"来宁游玩与儿子走散 母亲爬数百级台阶寻找累到虚脱","date":"2021-05-26 00:17:00","category":"头条","author_name":"","url":"https://mini.eastday.com/mobile/210526001702685994832.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001702_a7a67511b95f52d8ec13b068b29b9a42_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"2f243de14109c27a661e9c96021236fa","title":"七旬老人身体不适要摔倒 路人见状一把扶住","date":"2021-05-26 00:16:00","category":"头条","author_name":"","url":"https://mini.eastday.com/mobile/210526001659137273338.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001659_7105b9fc10f3d7ff2582d703728120db_1_mwpm_03201609.png","is_content":"1"},{"uniquekey":"ad9313f4a60b7ba205aa947e141ed21b","title":"海汕记浅析经营火锅店如何存活并持续盈利","date":"2021-05-26 00:15:00","category":"头条","author_name":"海汕记餐饮","url":"https://mini.eastday.com/mobile/210526001534467602939.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001534_8f41c4d62d857d85f8338559f96225d9_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"10e266adb633bf3238dad15d8fd91a0e","title":"解读 | 市场监管总局强化检验检测监管工作取得成效","date":"2021-05-26 00:14:00","category":"头条","author_name":"京津冀消息通","url":"https://mini.eastday.com/mobile/210526001403571446269.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001403_70b18bc8fe06bc3c80ccff8d6cee0245_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210526/20210526001403_70b18bc8fe06bc3c80ccff8d6cee0245_2_mwpm_03201609.jpeg","is_content":"1"}]
         * page : 1
         * pageSize : 30
         */

        private String stat;
        private String page;
        private String pageSize;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getPageSize() {
            return pageSize;
        }

        public void setPageSize(String pageSize) {
            this.pageSize = pageSize;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean extends BmobObject implements Serializable {
            /**
             * uniquekey : 84a41671e7f594c6537eabb36ecdb764
             * title : 绥宁：暖心！黄土矿镇党员干部帮村民抢收40余亩油菜籽
             * date : 2021-05-26 09:33:00
             * category : 头条
             * author_name : 大公湖南
             * url : https://mini.eastday.com/mobile/210526093335341631051.html
             * thumbnail_pic_s : https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03201609.jpeg
             * thumbnail_pic_s02 : https://dfzximg02.dftoutiao.com/news/20210526/20210526093335_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03201609.jpeg
             * is_content : 1
             * thumbnail_pic_s03 : https://dfzximg02.dftoutiao.com/news/20210526/20210526092107_0aa2e1728ff993d31d93a56878a62720_3_mwpm_03201609.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String is_content;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getIs_content() {
                return is_content;
            }

            public void setIs_content(String is_content) {
                this.is_content = is_content;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
