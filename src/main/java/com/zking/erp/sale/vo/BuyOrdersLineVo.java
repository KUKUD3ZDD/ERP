package com.zking.erp.sale.vo;

import com.zking.erp.basic.model.Goods;
import com.zking.erp.sale.model.Buyordersline;

import java.util.List;

public class BuyOrdersLineVo extends Buyordersline{
  private List<Goods> goods;
  private Integer sid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

}
