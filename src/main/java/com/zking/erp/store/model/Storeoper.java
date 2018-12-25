package com.zking.erp.store.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class Storeoper {
    private Integer stoid;

    private String empname;

    private Date opertime;

    private String storename;

    private String goodsname;

    private Integer num;

    private String type;

    public Integer getStoid() {
        return stoid;
    }

    public void setStoid(Integer stoid) {
        this.stoid = stoid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Storeoper{" +
                "stoid=" + stoid +
                ", empname='" + empname + '\'' +
                ", opertime=" + opertime +
                ", storename='" + storename + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", num=" + num +
                ", type='" + type + '\'' +
                '}';
    }
}