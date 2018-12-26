package com.zking.erp.repertory.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.repertory.model.Storedetail;
import com.zking.erp.repertory.service.IStoredetailService;
import com.zking.erp.repertory.vo.StoredetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Storedetail")
@Controller
public class StoredetailController {

    @Autowired
    private IStoredetailService storedetailService;

    @RequestMapping(value = "/queryStoredetailPager")
    @ResponseBody
    public Map queryStoredetailPager(StoredetailVo storedetailVo, HttpServletRequest req){
        PageBean pb=new PageBean();
        pb.setRequest(req);

        List<StoredetailVo> list = storedetailService.queryStoredetailPager(storedetailVo,pb);
        Map<String,Object> map=new HashMap<String,Object>();
            map.put("data",list);
            map.put("code",0);
            map.put("msg", "");
            map.put("count",pb.getTotal());
            map.put("page",pb);
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
