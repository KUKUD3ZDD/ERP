package com.zking.erp.basic.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.basic.model.GoodsType;
import com.zking.erp.basic.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/GoodsType")
public class GoodsTypeController {
    @Autowired
    private IGoodsTypeService goodsTypeService;

    @RequestMapping(value = "/queryListGoodsTypePager")
    @ResponseBody
    public Map<String ,Object> queryListGoodsTypePager(GoodsType gt, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map = new HashMap<String, Object>();
        List<GoodsType> list=goodsTypeService.queryListGoodsTypePager(gt,pageBean);
        map.put("data",list);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    @RequestMapping(value = "/delGoodsType")
    @ResponseBody
    public Map<String,Object> delGoodsType(Integer gtid){
        goodsTypeService.deleteByPrimaryKey(gtid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping(value = "/editGoodsType")
    @ResponseBody
    public Map<String,Object> editGoodsType(GoodsType gt){
        goodsTypeService.editGoodsType(gt);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping(value = "/addGoodsType")
    @ResponseBody
    public Map<String,Object> addGoodsType(GoodsType gt){
        goodsTypeService.insert(gt);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","添加成功");
        return map;
    }
}
