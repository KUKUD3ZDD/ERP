package com.zking.erp.store.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.store.model.Storedetail;
import com.zking.erp.store.service.IStoredetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/store")
@Controller
public class StoredetailController {
    @Autowired
    private IStoredetailService storedetailService;

    @RequestMapping("/storeList")
    @ResponseBody
    public Map<String,Object> queryStorePager(Storedetail storedetail, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<Storedetail> storeList = storedetailService.queryStorePager(storedetail, pageBean);
        map.put("data",storeList);
        System.out.println("库存查询。。。。");
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    //修改库存数量
    @RequestMapping("/editStore")
    @ResponseBody
    public Map<String,Object> editStore(Storedetail storedetail){
        int num=storedetail.getNum()-1;
        storedetail.setNum(num);
        storedetailService.updateByPrimaryKey(storedetail);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }






}
