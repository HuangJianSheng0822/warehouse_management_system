package com.dao;

import com.pojo.Ex;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExDao {
    public boolean setEx(String comId,String exTime,int exNum){

        int flag=0;
        int all=0;
        ResultSet resultSet = DBUtil.executeQuery ("select sum(exNum) FROM Ex where `comId`='"+comId+"'");
        ResultSet resultSet2 = DBUtil.executeQuery ("select comNum FROM commodity where `comId`='"+comId+"'");
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                flag=resultSet.getInt (1);
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        while (true){
            try {
                if (!resultSet2.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                all=Integer.valueOf (resultSet2.getString (1));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

        if (flag+exNum<=all){
            DBUtil.executeUpdate ("INSERT INTO `ex` (`comId`, `exTime`, `exNum`) VALUES" +
                    " ('"+comId+"', '"+exTime+"', "+exNum+")");
            return true;
        }else {
            return false;
        }
    }


    public List<Ex> exList(String comId){
        ArrayList<Ex> objects = new ArrayList<> ();
        ResultSet resultSet = DBUtil.executeQuery ("select * from ex where comId=\'" + comId + "\'");
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                objects.add (new Ex (resultSet.getLong ("exId"),resultSet.getString ("exTime"),
                        resultSet.getInt ("exNum")));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        return objects;
    }
}
