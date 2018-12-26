package com.zking.erp.basic.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Supplier;
import com.zking.erp.basic.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Supplier")
public class SupplierController {

    @Autowired
    private ISupplierService supplierService;

    @RequestMapping(value = "/queryListSupplierPager")
    @ResponseBody
    public Map<String ,Object> queryListSupplierPager(Supplier s, HttpServletRequest req, String ss){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        s.setSuname(ss);
        s.setSuaddress(ss);
        s.setSucontact(ss);
        s.setSutel(ss);
        s.setSuemail(ss);
        Map<String,Object> map = new HashMap<String, Object>();
        List<Supplier> list=supplierService.queryListSupplierPager(s,pageBean);
        map.put("data",list);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

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

    @RequestMapping(value = "/delSupplier")
    @ResponseBody
    public Map<String,Object> delSupplier(Integer suid){
        supplierService.deleteByPrimaryKey(suid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping(value = "/editSupplier")
    @ResponseBody
    public Map<String,Object> editSupplier(Supplier s){
        s.setSutype("供应商");
        supplierService.updateByPrimaryKey(s);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping(value = "/addSupplier")
    @ResponseBody
    public Map<String,Object> addSupplier(Supplier s){
        s.setSutype("供应商");
        supplierService.insert(s);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        return map;
    }

}
