package com.zking.erp.repertory.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.model.Storeoper;
import com.zking.erp.repertory.service.IStoreoperService;
import com.zking.erp.repertory.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Storeoper")
@Controller
public class StoreoperController {

    @Autowired
    private IStoreoperService storeoperService;

    @RequestMapping(value = "/queryStoreoperPager")
    @ResponseBody
    public Map queryStoreoperPager(StoreoperVo storeoper,HttpServletRequest req){
        System.out.println(storeoper.getOpertimeFW());
        PageBean pb=new PageBean();
        pb.setRequest(req);

        List<StoreoperVo> list = storeoperService.queryStoreoperPager(storeoper,pb);
        for (StoreoperVo storeoperVo : list) {
            System.out.println(storeoperVo);
        }
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("data",list);
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pb.getTotal());
        map.put("page",pb);
        return map;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> addStoreoper(Storeoper storeoper){
        Map<String,Object> map=new HashMap<String,Object>();
        storeoperService.insert(storeoper);
        map.put("message","添加成功");
        return map;
    }

}
