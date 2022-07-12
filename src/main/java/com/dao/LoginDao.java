package com.dao;

import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public Object adminLogin(String adminId) throws SQLException {
        String flag=null;
        ResultSet resultSet = DBUtil.executeQuery ("select adminPwd from admin where adminId = \""+adminId+"\"");
        if (resultSet==null){
            return flag;
        }
        while (resultSet.next ()){
            flag=resultSet.getString ("adminPwd");
        }
        return flag;
    }
   
}


