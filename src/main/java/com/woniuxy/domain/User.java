package com.woniuxy.domain;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String usersex;

    private String usercardid;

    private String usercall;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUsercardid() {
        return usercardid;
    }

    public void setUsercardid(String usercardid) {
        this.usercardid = usercardid;
    }

    public String getUsercall() {
        return usercall;
    }

    public void setUsercall(String usercall) {
        this.usercall = usercall;
    }
}