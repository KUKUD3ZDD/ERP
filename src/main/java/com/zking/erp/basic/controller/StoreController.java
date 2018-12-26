package com.zking.erp.basic.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.Store;
import com.zking.erp.basic.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Store")
public class StoreController {

    @Autowired
    private IStoreService storeService;

    @RequestMapping(value = "/queryListStorePager")
    @ResponseBody
    public Map<String, Object> queryListStorePager(Store s, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map = new HashMap<String, Object>();
        List<Store> list=storeService.queryListStorePager(s,pageBean);
        map.put("data",list);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    @RequestMapping(value = "/delStore")
    @ResponseBody
    public Map<String,Object> delStore(Integer sid){
        storeService.deleteByPrimaryKey(sid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        map.put("success",true);
        return map;
    }

    @RequestMapping(value = "/editStore")
    @ResponseBody
    public Map<String,Object> editStore(Store s){
        storeService.updateByPrimaryKey(s);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        map.put("success",true);
        return map;
    }

    @RequestMapping(value = "/addStore")
    @ResponseBody
    public Map<String,Object> addStore(Store s){
        storeService.insert(s);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        map.put("success",true);
        return map;
    }
}
