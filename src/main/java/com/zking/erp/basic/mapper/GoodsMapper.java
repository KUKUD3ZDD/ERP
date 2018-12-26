package com.zking.erp.basic.mapper;

import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.vo.GoodsVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsMapper {

    //商品删除
    int deleteByPrimaryKey(Integer gid);

    //商品新增
    int insert(Goods record);

    int insertSelective(Goods record);
//根据商品id查询商品
    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    //商品修改
    int updateByPrimaryKey(Goods record);

    //商品查询
    List<GoodsVo> queryListGoodsPager(GoodsVo g);

    //查询所有商品
    List<Goods> querygoods(Goods goods);

}