package com.zht.dao.jdbc;

import java.io.File;
import java.sql.*;
import java.util.concurrent.TimeUnit;

public class JDBCUtil {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/business?serverTimezone=GMT%2B8&useUnicoding=true&characterEncoding=UTF-8&useSSL=false&allowMultiQueries=true&autoReconnect=true";
    private static final String username = "root";
    private static final String password = "haitaotao123!";
    private static Connection conn;
    private static PreparedStatement pstmt;
    private static ResultSet rs;

    public static Connection getConn() {
        try {
            Class.forName(driver);
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void batchInsert() {
        String sql = "insert into t_order(order_no,user_id,product_id,count,total_cost)values(?,?,?,?,?)";
        long start = System.nanoTime();
        Connection conn = getConn();
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < 1000000; i++) {
                pstmt.setString(1, "123");
                pstmt.setInt(2, 1);
                pstmt.setInt(3, 2);
                pstmt.setInt(4, 10);
                pstmt.setDouble(5, 8.88);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        long end = System.nanoTime();
        //67秒
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒");
    }

    public static void batchInsert1() {
        String sql = "insert into t_order(order_no,user_id,product_id,count,total_cost)values(?,?,?,?,?)";
        long start = System.nanoTime();
        Connection conn = getConn();
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 100000; i++) {
                    pstmt.setString(1, "123");
                    pstmt.setInt(2, 1);
                    pstmt.setInt(3, 2);
                    pstmt.setInt(4, 10);
                    pstmt.setDouble(5, 8.88);
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        long end = System.nanoTime();
        //66秒
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒");
    }

    public static void batchInsert2() {
        String sql = "insert into t_order(order_no,user_id,product_id,count,total_cost)values(?,?,?,?,?)";
        long start = System.nanoTime();
        Connection conn = getConn();
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (int j = 0; j < 100; j++) {
                for (int i = 0; i < 10000; i++) {
                    pstmt.setString(1, "123");
                    pstmt.setInt(2, 1);
                    pstmt.setInt(3, 2);
                    pstmt.setInt(4, 10);
                    pstmt.setDouble(5, 8.88);
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        long end = System.nanoTime();
        //66秒
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒");
    }

    public static void batchInsert3() {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        String sql = "insert into t_order(order_no,user_id,product_id,count,total_cost)values";
        sb.append(sql);
        for (int i = 0; i < 1000000; i++) {
            if (i == 999999)
                sb.append("(?,?,?,?,?)");
            else
                sb.append("(?,?,?,?,?),");
        }
        Connection conn = getConn();
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sb.toString());
            //prepareStatement耗时3秒
            long end3 = System.nanoTime();
            System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end3 - start) + "秒");
            for (int i = 0; i < 1000000; i++) {
                pstmt.setString(5 * i + 1, "123");
                pstmt.setInt(5 * i + 2, 1);
                pstmt.setInt(5 * i + 3, 2);
                pstmt.setInt(5 * i + 4, 10);
                pstmt.setDouble(5 * i + 5, 8.88);
            }
            //prepareStatement耗时1秒
            long end2 = System.nanoTime();
            System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end2 - start) + "秒");
            pstmt.addBatch();
            //addBatch耗时3秒
            long end1 = System.nanoTime();
            System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end1 - start) + "秒");
            pstmt.executeBatch();
            //executeBatch耗时6秒
            long end0 = System.nanoTime();
            System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end0 - start) + "秒");
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        long end = System.nanoTime();
        //13秒
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒");
    }

    public static void loadData() {
        String path = JDBCUtil.class.getClassLoader().getResource("data.txt").getPath();
        if (path.startsWith("/"))
            path = path.substring(1);
        String sql = "load data local infile '" + path + "' into table t_order " +
        "CHARACTER SET utf8mb4 " +
        "FIELDS TERMINATED BY ',' " +
        "ESCAPED BY '\\\\' " +
        "LINES TERMINATED BY '\n' " +
        "(order_no,user_id,product_id,count,total_cost)";
        System.out.println(sql);

        //在命令窗口执行，load方法，耗时3秒
        long start = System.nanoTime();
        long end = System.nanoTime();
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒");
    }

    public static void main(String[] args) {
//        batchInsert();
//        batchInsert1();
//        batchInsert2();
//        batchInsert3();
        loadData();
    }
}
