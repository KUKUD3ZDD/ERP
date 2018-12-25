package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.model.Returnorders;
import com.zking.erp.sale.service.IReturnordersService;
import com.zking.erp.sale.vo.ReturnordersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/return")
@Controller
public class ReturnordersController {
    @Autowired
    private IReturnordersService returnordersService;

//退货订单查询
    @RequestMapping("/returnList")
    @ResponseBody
    public Map<String,Object> queryReturnPager(ReturnordersVo returnordersVo, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<ReturnordersVo> returnorders = returnordersService.queryReturnPager(returnordersVo,pageBean);
        map.put("data",returnorders);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    //修改退货订单状态
    @RequestMapping("/editReturnOrders")
    @ResponseBody
    public Map<String,Object> editOrders(Returnorders returnorders){
        //审核时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String checktime = df.format(new Date());
        returnorders.setChecktime(checktime);
        returnorders.setState("已审核");
       returnordersService.updateByPrimaryKey(returnorders);

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("data",true);
        map.put("message","审核成功");
        return map;
    }
}
