package com.woniuxy.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderid;

    private Date orderdate;

    private BigDecimal totalprices;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public BigDecimal getTotalprices() {
        return totalprices;
    }

    public void setTotalprices(BigDecimal totalprices) {
        this.totalprices = totalprices;
    }
}