package com.zking.erp.basic.mapper;

import com.zking.erp.basic.model.GoodsType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsTypeMapper {

    //商品类型删除
    int deleteByPrimaryKey(Integer gtid);

    //商品类型新增
    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    //商品类型查询
    List<GoodsType> queryListGoodsTypePager(GoodsType gt);

    //商品类型修改
    int editGoodsType(GoodsType gt);


}