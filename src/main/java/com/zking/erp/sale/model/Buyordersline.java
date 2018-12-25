package com.zking.erp.sale.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Date;
@ToString
public class Buyordersline extends BaseEntity{
    private String boid;

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

    public Buyordersline(String boid, Integer goodsid, String goodsname, Float price, Integer num, Float money, String endtime, String ender, Integer storeid, String state, String orderid) {
        this.boid = boid;
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

    public Buyordersline() {
        super();
    }

    public String getBoid() {
        return boid;
    }

    public void setBoid(String boid) {
        this.boid = boid;
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
}