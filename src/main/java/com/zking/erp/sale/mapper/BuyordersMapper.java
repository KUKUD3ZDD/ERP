package com.zking.erp.sale.mapper;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.vo.BuyordersVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BuyordersMapper {
    int deleteByPrimaryKey(Integer bid);
    //添加订单
    int insert(Buyorders record);

    int insertSelective(Buyorders record);

    Buyorders selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Buyorders record);

    //修改订单状态
    int updateByPrimaryKey(Buyorders record);
    //查询销售订单
    List<BuyordersVo> queryListPager(BuyordersVo buyordersVo);
}