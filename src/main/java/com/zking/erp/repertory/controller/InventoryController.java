package com.zking.erp.repertory.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.service.IInventoryService;
import com.zking.erp.repertory.vo.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Inventory")
@Controller
public class InventoryController {

    @Autowired
    private IInventoryService inventoryService;

    @RequestMapping(value = "/queryInventoryVoPager")
    @ResponseBody
    public Map queryInventoryVoPager(InventoryVo iv, HttpServletRequest req){
        PageBean pb=new PageBean();
        pb.setRequest(req);

        List<InventoryVo> list = inventoryService.queryInventoryVoPager(iv,pb);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("data",list);
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pb.getTotal());
        map.put("page",pb);
        return map;
    }
}
