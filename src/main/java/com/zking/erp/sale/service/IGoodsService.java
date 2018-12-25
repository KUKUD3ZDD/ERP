package com.zking.erp.sale.service;

import com.zking.erp.sale.model.Goods;

import java.util.List;

public interface IGoodsService {
    //查询所有商品
    List<Goods> querygoods(Goods goods);
    //根据商品id查询商品
    Goods selectByPrimaryKey(Integer gid);
}
