package com.zking.erp.sale.mapper;

import com.zking.erp.sale.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);
    //根据商品id查询商品
    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //查询所有商品
    List<Goods> querygoods(Goods goods);
}