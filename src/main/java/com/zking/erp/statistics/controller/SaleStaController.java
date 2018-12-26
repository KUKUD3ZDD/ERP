package com.zking.erp.statistics.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.vo.BuyordersVo;
import com.zking.erp.statistics.service.ISaleStaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/sale")
@Controller
public class SaleStaController {

    @Autowired
    private ISaleStaService saleStaService;

    @RequestMapping("/select")
    @ResponseBody
    public Map<String,Object> saleList(HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        Map<String, Object> map1 = saleStaService.saleList();
        map.put("data",map1);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }


}
