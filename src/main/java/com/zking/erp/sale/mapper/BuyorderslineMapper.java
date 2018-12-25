package com.zking.erp.sale.mapper;

import com.zking.erp.sale.model.Buyordersline;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BuyorderslineMapper {
    //删除订单详细
    int deleteByPrimaryKey(Integer boid);
   //添加订单明细
    int insert(Buyordersline record);

    int insertSelective(Buyordersline record);

    Buyordersline selectByPrimaryKey(Integer boid);

    int updateByPrimaryKeySelective(Buyordersline record);

    //修改订单详细状态
    int updateByPrimaryKey(Buyordersline record);

    //查询订单详细
    List<Buyordersline> querylinePager(Buyordersline buyordersline);

    /**
     * 批量增加
     */
    int insertBatch(List<Buyordersline> list);

    //查库管员
    Map<String,Object> empList(Buyordersline buyordersline);
}