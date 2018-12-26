package com.zking.erp.repertory.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class Storedetail extends BaseEntity{
    private Integer stid;

    private Integer storeid;

    private Integer goodsid;

    private Integer num;

    public Storedetail(Integer stid, Integer storeid, Integer goodsid, Integer num) {
        this.stid = stid;
        this.storeid = storeid;
        this.goodsid = goodsid;
        this.num = num;
    }

    public Storedetail() {
        super();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}