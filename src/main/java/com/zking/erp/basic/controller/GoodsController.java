package com.zking.erp.basic.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.service.IGoodsService;
import com.zking.erp.basic.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Goods")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @RequestMapping(value = "/queryListGoodsPager")
    @ResponseBody
    public Map<String ,Object> queryListGoodsPager(GoodsVo g, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map = new HashMap<String, Object>();
        List<GoodsVo> list=goodsService.queryListGoodsPager(g,pageBean);
        map.put("data",list);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    //查询所有商品
    @RequestMapping("/querygoods")
    @ResponseBody
    public Map<String,Object> queryListPager(Goods goods, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<Goods> querygoods = goodsService.querygoods(goods);
        map.put("data",querygoods);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    @RequestMapping(value = "/delGoods")
    @ResponseBody
    public Map<String,Object> delGoods(Integer gid){
        goodsService.deleteByPrimaryKey(gid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping(value = "/editGoods")
    @ResponseBody
    public Map<String,Object> editGoods(Goods g){
        goodsService.updateByPrimaryKey(g);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping(value = "/addGoods")
    @ResponseBody
    public Map<String,Object> addGoods(Goods g){
        goodsService.insert(g);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        return map;
    }
}
