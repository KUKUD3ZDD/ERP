package com.zking.erp.sale.model;

import java.util.Date;

public class Returnordersline {
    private String roid;

    private Integer goodsid;

    private String goodsname;

    private Float price;

    private Integer num;

    private Float money;

    private String endtime;

    private String ender;

    private Integer storeid;

    private String state;

    private String orderid;

    public Returnordersline(String roid, Integer goodsid, String goodsname, Float price, Integer num, Float money, String endtime, String ender, Integer storeid, String state, String orderid) {
        this.roid = roid;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.price = price;
        this.num = num;
        this.money = money;
        this.endtime = endtime;
        this.ender = ender;
        this.storeid = storeid;
        this.state = state;
        this.orderid = orderid;
    }

    public Returnordersline() {
        super();
    }

    public String getRoid() {
        return roid;
    }

    public void setRoid(String roid) {
        this.roid = roid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Returnordersline{" +
                "roid='" + roid + '\'' +
                ", goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", money=" + money +
                ", endtime='" + endtime + '\'' +
                ", ender='" + ender + '\'' +
                ", storeid=" + storeid +
                ", state='" + state + '\'' +
                ", orderid='" + orderid + '\'' +
                '}';
    }
}