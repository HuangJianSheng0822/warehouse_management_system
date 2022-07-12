package com.pojo;


public class Admin {

  private String adminId;
  private String adminPwd;

  public Admin() {
  }

  public Admin( String adminId , String adminPwd ) {
    this.adminId = adminId;
    this.adminPwd = adminPwd;
  }

  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
  }


  public String getAdminPwd() {
    return adminPwd;
  }

  public void setAdminPwd(String adminPwd) {
    this.adminPwd = adminPwd;
  }

}
