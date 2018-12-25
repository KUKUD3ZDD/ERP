package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.model.Returnorders;
import com.zking.erp.sale.model.Returnordersline;
import com.zking.erp.sale.service.IBuyorderslineService;
import com.zking.erp.sale.service.IReturnordersService;
import com.zking.erp.sale.service.IReturnorderslineService;
import com.zking.erp.store.model.Storedetail;
import com.zking.erp.store.model.Storeoper;
import com.zking.erp.store.service.IStoredetailService;
import com.zking.erp.store.service.StoreoperService;
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

@RequestMapping("/returnordersline")
@Controller
public class ReturnorderslineController {

    @Autowired
    private IReturnorderslineService returnorderslineService;
    @Autowired
    private IReturnordersService returnordersService;
    @Autowired
    private IStoredetailService storedetailService;
    @Autowired
    private StoreoperService storeoperService;
    @Autowired
    private IBuyorderslineService buyorderslineService;

    @RequestMapping(value = "/query")
    @ResponseBody
    public Map<String,Object> queryReturnOrderslinePager(Returnordersline returnordersline, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<Returnordersline> returnorderslines = returnorderslineService.queryReturnOrderslinePager(returnordersline);
        System.out.println(returnorderslines);
        map.put("data",returnorderslines);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }

    //修改订单详细状态       入库:修改退货订单和订单详细的状态,增加库存,添加库存变动记录
    @RequestMapping("/editReturnOrdersline")
    @ResponseBody
    public Map<String,Object> editOrders(Returnorders returnorders, Returnordersline returnordersline, Storeoper storeoper, Storedetail storedetail,Buyordersline buyordersline){
        //出库时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String endtime = df.format(new Date());
        System.out.println(endtime);

       //修改退货订单详细
        //查询库管员
        Map<String, Object> map1 = buyorderslineService.empList(buyordersline);
        String name = map1.get("name").toString();
        System.out.println("name:"+name);
        returnordersline.setEndtime(endtime);
        returnordersline.setState("已入库");
        returnorderslineService.updateByPrimaryKey(returnordersline);

        //根据订单id查询订单详细的订单状态
        List<Returnordersline> returnorderslines = returnorderslineService.queryReturnOrderslinePager(returnordersline);
        System.out.println(returnorderslines);
        boolean b=true;
        for (Returnordersline returnordersline1 : returnorderslines) {
            if("未入库".equals(returnordersline1.getState())){
                b=false;
            }
        }
        if(b){
            //修改退货订单
            returnorders.setEndtime(endtime);
            returnorders.setState("已入库");
            returnordersService.updateByPrimaryKey(returnorders);
        }

        //增加库存
        int num=storedetail.getNum()+1;
        storedetail.setNum(num);
        storedetailService.updateByPrimaryKey(storedetail);
        System.out.println("3:"+storedetail);
       //添加库存变动记录
        //员工id?(订单明细和变动记录表)
        storeoper.setType("入库");
        storeoper.setEmpname(name);
        storeoperService.insert(storeoper);
        System.out.println("4:"+storeoper);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("data",true);
        map.put("message","入库成功");
        return map;
    }


}
