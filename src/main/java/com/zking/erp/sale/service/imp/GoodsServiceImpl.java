package com.zking.erp.sale.service.imp;

import com.zking.erp.sale.mapper.GoodsMapper;
import com.zking.erp.sale.model.Goods;
import com.zking.erp.sale.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class GoodsServiceImpl implements IGoodsService {
     @Autowired
     private GoodsMapper goodsMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Goods> querygoods(Goods goods) {

        return goodsMapper.querygoods(goods);
    }

    @Override
    public Goods selectByPrimaryKey(Integer gid) {
        return goodsMapper.selectByPrimaryKey(gid);
    }
}
