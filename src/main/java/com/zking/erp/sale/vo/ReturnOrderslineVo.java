package com.zking.erp.sale.vo;

import com.zking.erp.sale.model.Goods;
import com.zking.erp.sale.model.Returnordersline;

import java.util.List;

public class ReturnOrderslineVo extends Returnordersline {
    private List<Goods> goods;

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
