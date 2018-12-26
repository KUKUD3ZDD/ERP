package com.zking.erp.basic.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.GoodsType;

import java.util.List;

public interface IGoodsTypeService {

    /**
     * 商品类型查询
     * @param gt
     * @return
     */
    List<GoodsType> queryListGoodsTypePager(GoodsType gt, PageBean pageBean);

    /**
     * 商品类型删除
     * @param gtid
     * @return
     */
    int deleteByPrimaryKey(Integer gtid);

    /**
     * 商品类型修改
     * @param gt
     * @return
     */
    int editGoodsType(GoodsType gt);

    /**
     * 商品类型新增
     * @param record
     * @return
     */
    int insert(GoodsType record);
}
