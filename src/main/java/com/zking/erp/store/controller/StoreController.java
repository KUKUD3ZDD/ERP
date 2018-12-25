package com.zking.erp.store.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Supplier;
import com.zking.erp.store.model.Store;
import com.zking.erp.store.service.StoreService;
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
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping("/querystore")
    @ResponseBody
    public Map<String, Object> queryListPager(Store store, HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Store> stores = storeService.queryStore(store);
        map.put("data", stores);
        map.put("code", 0);
        map.put("count", pageBean.getTotal());
        map.put("msg", "");
        map.put("page", pageBean);
        return map;
    }
}