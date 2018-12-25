package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Goods;
import com.zking.erp.sale.model.Supplier;
import com.zking.erp.sale.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/goods")
@Controller
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

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

}
