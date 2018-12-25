package com.zking.erp.sale.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

import java.util.Date;
@ToString
public class Buyorders extends BaseEntity{
        private String bid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checktime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String endtime;

    private String type;

    private String creater;

    private String checker;

    private String starter;

    private Integer supplierid;

    private Float totalmoney;

    private String state;

    public Buyorders(String bid, Date createtime, Date checktime, Date startime, String endtime, String type, String creater, String checker, String starter,Integer supplierid, Float totalmoney, String state) {
        this.bid = bid;
        this.createtime = createtime;
        this.checktime = checktime;
        this.startime = startime;
        this.endtime = endtime;
        this.type = type;
        this.creater = creater;
        this.checker = checker;
        this.starter = starter;
        this.supplierid = supplierid;
        this.totalmoney = totalmoney;
        this.state = state;
    }

    public Buyorders() {
        super();
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
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

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
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