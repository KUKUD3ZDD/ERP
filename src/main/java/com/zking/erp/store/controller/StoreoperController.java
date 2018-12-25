package com.zking.erp.store.controller;

import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.store.model.Storeoper;
import com.zking.erp.store.service.IStoredetailService;
import com.zking.erp.store.service.StoreoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/storeOper")
@Controller
public class StoreoperController {

    @Autowired
    private StoreoperService storeoperService;

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> addStoreoper(Storeoper storeoper){
        Map<String,Object> map=new HashMap<String,Object>();
        storeoperService.insert(storeoper);
        map.put("message","添加成功");
        return map;
    }


}
