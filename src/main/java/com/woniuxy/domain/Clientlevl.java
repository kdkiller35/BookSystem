package com.woniuxy.domain;

import java.math.BigDecimal;

public class Clientlevl {
    private Integer clientlevlid;

    private String clientlevlname;

    private BigDecimal discount;

    public Integer getClientlevlid() {
        return clientlevlid;
    }

    public void setClientlevlid(Integer clientlevlid) {
        this.clientlevlid = clientlevlid;
    }

    public String getClientlevlname() {
        return clientlevlname;
    }

    public void setClientlevlname(String clientlevlname) {
        this.clientlevlname = clientlevlname;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}