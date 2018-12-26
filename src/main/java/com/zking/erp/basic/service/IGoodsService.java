package com.zking.erp.basic.service;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.vo.GoodsVo;

import java.util.List;

public interface IGoodsService {
    /**
     * 商品查询
     * @param g
     * @return
     */
    List<GoodsVo> queryListGoodsPager(GoodsVo g, PageBean pageBean);

    /**
     * 商品删除
     * @param gid
     * @return
     */
    int deleteByPrimaryKey(Integer gid);

    /**
     * 商品修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Goods record);

    /**
     * 商品新增
     * @param record
     * @return
     */
    int insert(Goods record);

    //根据商品id查询商品
    Goods selectByPrimaryKey(Integer gid);

    //查询所有商品
    List<Goods> querygoods(Goods goods);




}
