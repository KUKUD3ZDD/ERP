package com.zking.erp.sale.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Returnorders;
import com.zking.erp.sale.vo.BuyordersVo;
import com.zking.erp.sale.vo.ReturnordersVo;

import java.util.List;

public interface IReturnordersService {

    //退货订单查询
    List<ReturnordersVo> queryReturnPager(ReturnordersVo returnordersVo,PageBean pageBean);

    //添加退货订单
    int insert(Returnorders record);

    //修改退货订单状态(审核)
    int updateByPrimaryKey(Returnorders record);



}
