package com.zking.erp.store.mapper;

import com.zking.erp.store.model.Storedetail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoredetailMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Storedetail record);

    int insertSelective(Storedetail record);

    Storedetail selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Storedetail record);
    //修改库存数量
    int updateByPrimaryKey(Storedetail record);
    //查询库存
    List<Storedetail> queryStorePager(Storedetail storedetail);
}