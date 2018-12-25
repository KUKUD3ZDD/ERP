package com.zking.erp.store.mapper;

import com.zking.erp.store.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoreMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
    //查询仓库
    List<Store> queryStore(Store store);

}