package com.zking.erp.sale.service;

import com.zking.erp.sale.model.Returnordersline;

import java.util.List;

public interface IReturnorderslineService {
    //查询订单详细
    List<Returnordersline> queryReturnOrderslinePager(Returnordersline returnordersline);

    //添加退货订单详细
    int insert(Returnordersline record);

    //修改订单详细状态
    int updateByPrimaryKey(Returnordersline record);
}
