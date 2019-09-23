package com.woniuxy.domain;

import java.util.Date;

public class Client {
    private Integer clientid;

    private Integer clientlevlid;

    private String clientname;

    private String clientsex;

    private Date birthday;

    private String usercall;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getClientlevlid() {
        return clientlevlid;
    }

    public void setClientlevlid(Integer clientlevlid) {
        this.clientlevlid = clientlevlid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientsex() {
        return clientsex;
    }

    public void setClientsex(String clientsex) {
        this.clientsex = clientsex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUsercall() {
        return usercall;
    }

    public void setUsercall(String usercall) {
        this.usercall = usercall;
    }
}