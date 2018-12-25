package com.zking.erp.sale.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Returnorders {
    private String rid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String checktime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String endtime;

    private String type;

    private String creater;

    private String checker;

    private Integer supplierid;

    private Float totalmoney;

    private String state;

    public Returnorders(String rid, Date createtime, String checktime, String endtime, String type, String creater, String checker,Integer supplierid, Float totalmoney, String state) {
        this.rid = rid;
        this.createtime = createtime;
        this.checktime = checktime;
        this.endtime = endtime;
        this.type = type;
        this.creater = creater;
        this.checker = checker;
        this.supplierid = supplierid;
        this.totalmoney = totalmoney;
        this.state = state;
    }

    public Returnorders() {
        super();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}