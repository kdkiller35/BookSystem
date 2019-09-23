package com.woniuxy.domain;

import java.util.Date;

public class Inventory {
    private Integer inventoryid;

    private Integer inventorycount;

    private Date updatetime;

    private Integer pid;

    private Integer bookid;

    private String remarks;

    public Integer getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(Integer inventoryid) {
        this.inventoryid = inventoryid;
    }

    public Integer getInventorycount() {
        return inventorycount;
    }

    public void setInventorycount(Integer inventorycount) {
        this.inventorycount = inventorycount;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}