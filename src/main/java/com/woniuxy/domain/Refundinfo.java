package com.woniuxy.domain;

import java.math.BigDecimal;

public class Refundinfo {
    private Integer refundinfoid;

    private BigDecimal refundinfoprice;

    private Integer refundinfocount;

    private BigDecimal refundinmoney;

    private Integer pid;

    private Integer clientid;

    private Integer userid;

    private Integer refundid;

    private Integer bookid;

    public Integer getRefundinfoid() {
        return refundinfoid;
    }

    public void setRefundinfoid(Integer refundinfoid) {
        this.refundinfoid = refundinfoid;
    }

    public BigDecimal getRefundinfoprice() {
        return refundinfoprice;
    }

    public void setRefundinfoprice(BigDecimal refundinfoprice) {
        this.refundinfoprice = refundinfoprice;
    }

    public Integer getRefundinfocount() {
        return refundinfocount;
    }

    public void setRefundinfocount(Integer refundinfocount) {
        this.refundinfocount = refundinfocount;
    }

    public BigDecimal getRefundinmoney() {
        return refundinmoney;
    }

    public void setRefundinmoney(BigDecimal refundinmoney) {
        this.refundinmoney = refundinmoney;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRefundid() {
        return refundid;
    }

    public void setRefundid(Integer refundid) {
        this.refundid = refundid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
}