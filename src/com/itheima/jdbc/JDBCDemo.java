package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取链接
        String password="1";
        String username="";
        String url="";
        Connection connection = DriverManager.getConnection(url, username, password);
    }
}
