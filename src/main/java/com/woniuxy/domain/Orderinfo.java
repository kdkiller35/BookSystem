package com.woniuxy.domain;

import java.math.BigDecimal;

public class Orderinfo {
    private Integer orderinfoid;

    private BigDecimal sallprice;

    private Integer sallcount;

    private Integer sallmoney;

    private Integer orderid;

    private Integer userid;

    private Integer bookid;

    private Integer clientid;

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public BigDecimal getSallprice() {
        return sallprice;
    }

    public void setSallprice(BigDecimal sallprice) {
        this.sallprice = sallprice;
    }

    public Integer getSallcount() {
        return sallcount;
    }

    public void setSallcount(Integer sallcount) {
        this.sallcount = sallcount;
    }

    public Integer getSallmoney() {
        return sallmoney;
    }

    public void setSallmoney(Integer sallmoney) {
        this.sallmoney = sallmoney;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }
}