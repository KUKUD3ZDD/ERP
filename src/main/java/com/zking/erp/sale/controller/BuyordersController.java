package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.service.IBuyordersService;
import com.zking.erp.sale.vo.BuyordersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/buyorders")
@Controller
public class BuyordersController {
@Autowired
    private IBuyordersService buyordersService;

    @RequestMapping("/select")
    @ResponseBody
    public Map<String,Object> queryListPager(BuyordersVo buyordersVo, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<BuyordersVo> orders = buyordersService.queryListPager(buyordersVo, pageBean);
        map.put("data",orders);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }
    //添加订单
    @RequestMapping("/addorders")
    @ResponseBody
    public Map<String,Object> addOrders(Buyorders buyorders){
        buyordersService.insert(buyorders);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        return map;
    }

    //修改订单状态
    @RequestMapping("/editorders")
    @ResponseBody
    public Map<String,Object> editOrders(Buyorders buyorders){
        buyordersService.updateByPrimaryKey(buyorders);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }
}
