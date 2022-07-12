package com.pojo;

public class User {
    private String userId;
    private String userName;
    private String userSex;

    public User() {
    }

    public User( String userId , String userName , String userSex ) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex( String userSex ) {
        this.userSex = userSex;
    }
}
