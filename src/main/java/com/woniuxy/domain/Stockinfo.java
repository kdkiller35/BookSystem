package com.woniuxy.domain;

import java.math.BigDecimal;

public class Stockinfo {
    private Integer stockinfoid;

    private BigDecimal stockprice;

    private Integer stockcount;

    private BigDecimal stockmoney;

    private Integer pid;

    private Integer stockid;

    private Integer bookid;

    private Integer userid;

    public Integer getStockinfoid() {
        return stockinfoid;
    }

    public void setStockinfoid(Integer stockinfoid) {
        this.stockinfoid = stockinfoid;
    }

    public BigDecimal getStockprice() {
        return stockprice;
    }

    public void setStockprice(BigDecimal stockprice) {
        this.stockprice = stockprice;
    }

    public Integer getStockcount() {
        return stockcount;
    }

    public void setStockcount(Integer stockcount) {
        this.stockcount = stockcount;
    }

    public BigDecimal getStockmoney() {
        return stockmoney;
    }

    public void setStockmoney(BigDecimal stockmoney) {
        this.stockmoney = stockmoney;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}