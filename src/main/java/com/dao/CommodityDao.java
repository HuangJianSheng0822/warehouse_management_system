package com.dao;

import com.pojo.Commodity;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityDao {
    public List<Commodity> commodityList(int page,int limit){
        ArrayList<Commodity> objects = new ArrayList<> ();

        ResultSet resultSet = DBUtil.executeQuery ("select * from commodity limit "+page+","+limit);
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                objects.add (new Commodity (resultSet.getString ("comId"),resultSet.getString ("comName"),
                        resultSet.getString ("comNum"),resultSet.getString ("comKind"),
                        resultSet.getString ("fragile"),resultSet.getString ("comTime")));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

        return objects;
    }

    public int addCom(Commodity commodity){
        int i = DBUtil.executeUpdate ("INSERT INTO `commodity` (`comId`, `comName`, `comNum`, `comKind`, `fragile`, `comTime`) VALUES" +
                " ('" + commodity.getComId () + "', '" + commodity.getComName () + "', '" + commodity.getComNum () + "', '" + commodity.getComKind () + "', '" + commodity.getFragile ()
                + "', '" + commodity.getComTime () + "')");
        return i;
    }
    public int delCom(String comId){
        int i = DBUtil.executeUpdate ("DELETE FROM `commodity` WHERE (`comId`='" + comId + "')");
        return i;
    }
    public int updateCom(Commodity commodity){
        int i = DBUtil.executeUpdate ("UPDATE `commodity` SET " +
                "`comName`='" + commodity.getComName () + "', `comNum`='" + commodity.getComNum () + "', `comKind`='" + commodity.getComKind () + "', " +
                "`fragile`='" + commodity.getFragile () + "', `comTime`='" + commodity.getComTime () + "' WHERE `comId`='" + commodity.getComId () + "'");

        return i;
    }

    public List<Commodity> select(String comName){
        ArrayList<Commodity> objects = new ArrayList<> ();
        ResultSet resultSet = DBUtil.executeQuery ("select * from commodity where comName like '%"+comName+"%'");
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                objects.add (new Commodity (resultSet.getString ("comId"),resultSet.getString ("comName"),
                        resultSet.getString ("comNum"),resultSet.getString ("comKind"),
                        resultSet.getString ("fragile"),resultSet.getString ("comTime")));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

        return objects;
    }

    public int count(){
        int flag=0;
        ResultSet resultSet = DBUtil.executeQuery ("select count(*) from commodity");
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
        return flag;
    }

    public String getHas(String comId){
        String flag=null;
        ResultSet resultSet = DBUtil.executeQuery ("select comName from commodity where comId="+comId);
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                flag=resultSet.getString (1);
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        return flag;
    }

}
