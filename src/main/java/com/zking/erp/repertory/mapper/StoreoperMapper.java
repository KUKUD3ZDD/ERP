package com.zking.erp.repertory.mapper;

import com.zking.erp.repertory.model.Storeoper;
import com.zking.erp.repertory.vo.StoreoperVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreoperMapper {
    int deleteByPrimaryKey(Integer stoid);

    /**
     * 添加库存变动记录
     * @param record
     * @return
     */
    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Integer stoid);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);

    /**
     * 分页查询库存变动记录
     * @param sto
     * @return
     */
    List<StoreoperVo> queryStoreoperPager(StoreoperVo sto);
}