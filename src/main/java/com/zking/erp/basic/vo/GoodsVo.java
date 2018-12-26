package com.zking.erp.basic.vo;

import com.zking.erp.basic.model.Goods;

public class GoodsVo extends Goods{
    private String gtname;

    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname;
    }

    public GoodsVo(){}
}
