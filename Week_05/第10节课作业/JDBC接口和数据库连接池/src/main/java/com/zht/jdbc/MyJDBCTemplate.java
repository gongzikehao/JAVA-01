package com.zht.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyJDBCTemplate {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/just-for-test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "haitaotao123!";
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static HikariDataSource dataSource;

    static {
        dataSource = getHikariDataSource();
    }

    public static HikariDataSource getHikariDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(DRIVER);
        config.setJdbcUrl(URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.setAutoCommit(false);
        config.setConnectionTestQuery("SELECT 1;");
        config.setMaximumPoolSize(10);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.setMaxLifetime(1 * 60 * 1000);
        config.setIdleTimeout(5 * 60 * 1000);
        return new HikariDataSource(config);
    }

    public static Connection getConnFromPool() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static Connection getConn() {
        if (conn == null) {
            try {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
                stmt = null;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void batchUpdate(List<String> sqlList) {
        try {
//            Connection conn = getConn();
            Connection conn = getConnFromPool();
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            for (String sql : sqlList) {
                stmt.addBatch(sql);
            }
            stmt.executeBatch();
            conn.commit();
            System.out.println("批量更新操作完成！");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            close();
        }
    }

    private static void simpleUpdate(String sql) {
        try {
//            Connection conn = getConn();
            Connection conn = getConnFromPool();
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.commit();
            System.out.println("更新操作完成！");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            close();
        }
    }

    public static void simpleAdd(String sql) {
        simpleUpdate(sql);
    }

    public static void simpleRemove(String sql) {
        simpleUpdate(sql);
    }

    public static void simpleModify(String sql) {
        simpleUpdate(sql);
    }

    public static List<Map<String, Object>> simpleQuery(String sql) {
        List<Map<String, Object>> list = new ArrayList<>();
        try {
//            conn = getConn();
            conn = getConnFromPool();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Map<String, Object> resMap = new HashMap<>();
                resMap.put("id", rs.getInt("id"));
                resMap.put("name", rs.getString("t_name"));
                resMap.put("number", rs.getString("t_number"));
                list.add(resMap);
            }
            System.out.println("查询操作完成！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }

}
