package com.zking.erp.sale.mapper;

import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.model.Returnordersline;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ReturnorderslineMapper {
    int deleteByPrimaryKey(Integer roid);
//添加退货订单详细
    int insert(Returnordersline record);

    int insertSelective(Returnordersline record);

    Returnordersline selectByPrimaryKey(Integer roid);

    int updateByPrimaryKeySelective(Returnordersline record);
//修改订单详细状态
    int updateByPrimaryKey(Returnordersline record);

    //查询订单详细
    List<Returnordersline> queryReturnOrderslinePager(Returnordersline returnordersline);



}