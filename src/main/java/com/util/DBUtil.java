package com.util;

import java.io.InputStream;
import java.sql.*;
import java.util.*;


public class DBUtil {
    private static Properties dbProps = new Properties();

    /**
     * 读取配置文件，加载数据库驱动
     */
    static {
        try {
            InputStream is = DBUtil.class.getResourceAsStream("/dbinfo.properties");
            dbProps.load(is);
            Class.forName(dbProps.getProperty("db.driver"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     */
    public static Connection getConn() {
        try {
            return DriverManager.getConnection(dbProps.getProperty("db.connectUrl"), dbProps.getProperty("db.user"),
                    dbProps.getProperty("db.pwd"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 关闭数据库连接等对象
     *
     */
    public static void close(Statement pstmt, Connection con) {
        try {

            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs, Statement pstm, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            close(pstm, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行增删改
     */
    public static int executeUpdate(String sql) {
        Connection con = getConn ();
        Statement statement=null;
        int flag=-1;

        try {
            statement = con.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        try {
            flag = statement.executeUpdate (sql);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return flag;
    }

    public static ResultSet executeQuery(String sql) {
        Connection con = null;
        Statement statement=null;
        ResultSet rs = null;

            con = getConn();
        try {
            statement=con.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        try {
            rs = statement.executeQuery (sql);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return rs;

    }


}
