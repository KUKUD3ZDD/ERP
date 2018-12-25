package com.zking.erp.sale.mapper;

import com.zking.erp.sale.model.Returnorders;
import com.zking.erp.sale.vo.ReturnordersVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReturnordersMapper {
    int deleteByPrimaryKey(Integer rid);
   //添加退货订单
    int insert(Returnorders record);

    int insertSelective(Returnorders record);

    Returnorders selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Returnorders record);
//修改退货订单状态(审核)
    int updateByPrimaryKey(Returnorders record);
//退货订单查询
    List<ReturnordersVo> queryReturnPager(ReturnordersVo returnordersVo);
}