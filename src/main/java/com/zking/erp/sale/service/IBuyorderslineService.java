package com.zking.erp.sale.service;

import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.model.Returnordersline;

import java.util.List;
import java.util.Map;

public interface IBuyorderslineService {
    //添加订单详细
    int insert(Buyordersline record);

    //删除订单详细
    int deleteByPrimaryKey(Integer boid);

    //查询订单详细
    List<Buyordersline> querylinePager(Buyordersline buyordersline);

    //修改订单详细状态
    int updateByPrimaryKey(Buyordersline record);

    /**
     * 批量增加
     */
    int insertBatch(List<Buyordersline> list);

    //查库管员
    Map<String,Object> empList(Buyordersline buyordersline);

}
