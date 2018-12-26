package com.zking.erp.repertory.mapper;

import com.zking.erp.repertory.model.Inventory;
import com.zking.erp.repertory.vo.InventoryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    /**
     * 分页查询盘盈盘亏表 未审核
     * @param iv
     * @return
     */
    List<InventoryVo> queryInventoryVoPager(InventoryVo iv);
}