package com.zking.erp.store.mapper;

import com.zking.erp.store.model.Storeoper;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreoperMapper {
    int deleteByPrimaryKey(Integer stoid);
    //添加库存变动记录
    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Integer stoid);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}