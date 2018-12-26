package com.zking.erp.repertory.mapper;

import com.zking.erp.repertory.model.Storedetail;
import com.zking.erp.repertory.vo.StoredetailVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoredetailMapper {
    int deleteByPrimaryKey(Integer stid);

    /**
     * 采购添加库存
     * @param record
     * @return
     */
    int insert(Storedetail record);

    int insertSelective(Storedetail record);

    Storedetail selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Storedetail record);
//修改库存数量
    int updateByPrimaryKey(Storedetail record);

    /**
     * 库存查询
     * @param stVo
     * @return
     */
    List<StoredetailVo> queryStoredetailPager(StoredetailVo stVo);

    //根据商品id查询库存数量
    Storedetail StoreList(Storedetail storedetail);
}