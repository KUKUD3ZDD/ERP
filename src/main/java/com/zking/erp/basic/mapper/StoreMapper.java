package com.zking.erp.basic.mapper;

import com.zking.erp.basic.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoreMapper {

    //仓库删除
    int deleteByPrimaryKey(Integer sid);

    //仓库新增
    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Store record);

    //仓库修改
    int updateByPrimaryKey(Store record);

    //仓库查询
    List<Store> queryListStorePager(Store store);
}