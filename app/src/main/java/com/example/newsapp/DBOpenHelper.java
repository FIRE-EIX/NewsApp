package com.example.newsapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOpenHelper {
    private static String driver = "com.mysql.cj.jdbc.Driver"; //MySql驱动
    private static String url = "jdbc:mysql://127.0.0.1:3306/news_api?characterEncoding=utf-8"; //MySql数据库连接url
    private static String user = "root"; //用户名
    private static String paswword = "123456"; //密码

    /*连接数据库*/
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, paswword); //获取连接
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
