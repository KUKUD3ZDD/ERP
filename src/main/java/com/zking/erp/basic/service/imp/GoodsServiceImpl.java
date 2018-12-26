package com.zking.erp.basic.service.imp;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.mapper.GoodsMapper;
import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.service.IGoodsService;
import com.zking.erp.basic.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Transactional(readOnly = true)
    @Override
    public List<GoodsVo> queryListGoodsPager(GoodsVo g, PageBean pageBean) {
        return goodsMapper.queryListGoodsPager(g);
    }

    @Transactional(readOnly = true)
    @Override
    public int deleteByPrimaryKey(Integer gid) {
        return goodsMapper.deleteByPrimaryKey(gid);
    }

    @Transactional(readOnly = true)
    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    @Transactional(readOnly = true)
    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public Goods selectByPrimaryKey(Integer gid) {
        return goodsMapper.selectByPrimaryKey(gid);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Goods> querygoods(Goods goods) {
        return goodsMapper.querygoods(goods);
    }
}
