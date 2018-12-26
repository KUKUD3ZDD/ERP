package com.zking.erp.repertory.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class Inventory extends BaseEntity{
    private Integer pid;

    private Integer storeid;

    private Integer goodsid;

    private String type;

    private Integer num;

    private String startime;

    private String checktime;

    private String starter;

    private String checker;

    private String state;

    private String remark;

    public Inventory(Integer pid, Integer storeid, Integer goodsid, String type, Integer num, String startime, String checktime, String starter, String checker, String state, String remark) {
        this.pid = pid;
        this.storeid = storeid;
        this.goodsid = goodsid;
        this.type = type;
        this.num = num;
        this.startime = startime;
        this.checktime = checktime;
        this.starter = starter;
        this.checker = checker;
        this.state = state;
        this.remark = remark;
    }

    public Inventory() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}