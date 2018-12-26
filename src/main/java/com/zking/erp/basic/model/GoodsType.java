package com.zking.erp.basic.model;

import com.zking.erp.base.Model.BaseEntity;
import lombok.ToString;

@ToString
public class GoodsType extends BaseEntity {
    private Integer gtid;

    private String gtname;

    public GoodsType(Integer gtid, String gtname) {
        this.gtid = gtid;
        this.gtname = gtname;
    }

    public GoodsType() {
        super();
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname;
    }
}