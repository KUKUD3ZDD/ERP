package com.zking.erp.store.mapper;

import com.zking.erp.store.model.Inventory;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}