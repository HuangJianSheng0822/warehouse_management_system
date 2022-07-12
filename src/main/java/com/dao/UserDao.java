package com.dao;

import com.pojo.Commodity;
import com.pojo.User;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> userList(int page,int limit){
        ArrayList<User> objects = new ArrayList<> ();
        ResultSet resultSet = DBUtil.executeQuery ("select * from user limit "+page+","+limit);
        while (true){
            try {
                if (!resultSet.next ()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                objects.add (new User (resultSet.getString ("userId"),resultSet.getString ("userName"),resultSet.getString ("userSex")));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        return objects;
    }

    public int addUser(User user ){
        int i = DBUtil.executeUpdate ("INSERT INTO `user` (`userId`, `userName`, `userSex`) VALUES ('"+user.getUserId ()+"', '"+user.getUserName ()+"', '"+user.getUserSex ()+"')");
        return i;
    }
    public int delUser(String userId){
        int i = DBUtil.executeUpdate ("DELETE FROM `user` WHERE (`userId`='" + userId + "')");
        return i;
    }
    public int updateUser(User user){
        int i = DBUtil.executeUpdate("UPDATE `user` SET " +
                "`userName`='"+user.getUserName ()+"', `userSex`='"+user.getUserSex ()
                +"' WHERE (`userId`='"+user.getUserId ()+"')");

        return i;
    }
}
