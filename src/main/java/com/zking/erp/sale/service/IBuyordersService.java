package com.zking.erp.sale.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.vo.BuyordersVo;

import java.util.List;
import java.util.Map;

public interface IBuyordersService {
    //查询销售订单
    List<BuyordersVo> queryListPager(BuyordersVo buyordersVo, PageBean pageBean);

    //添加订单
    int insert(Buyorders record);

    //修改订单状态
    int updateByPrimaryKey(Buyorders record);
}
