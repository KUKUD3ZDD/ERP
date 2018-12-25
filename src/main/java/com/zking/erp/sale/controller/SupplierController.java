package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Supplier;
import com.zking.erp.sale.service.ISupplierService;
import com.zking.erp.sale.vo.BuyordersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/supplier")
@Controller
public class SupplierController {
    @Autowired
    private ISupplierService supplierService;

    @RequestMapping("/querysupplier")
    @ResponseBody
    public Map<String,Object> queryListPager(Supplier supplier, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<Supplier> suppliers = supplierService.querySupplier(supplier);
        map.put("data",suppliers);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }
}
