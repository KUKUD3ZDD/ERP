package com.zking.erp.sale.controller;

import com.zking.erp.base.util.PageBean;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.service.IBuyordersService;
import com.zking.erp.sale.service.IBuyorderslineService;
import com.zking.erp.sale.vo.BuyordersVo;
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
import java.util.*;

@RequestMapping("/ordersline")
@Controller
public class BuyorderslineController {

    @Autowired
    private IBuyorderslineService buyorderslineService;
    @Autowired
    private IBuyordersService buyordersService;
    @Autowired
    private IStoredetailService storedetailService;
    @Autowired
    private StoreoperService storeoperService;

    @RequestMapping("/del")
    @ResponseBody
    public Map<String,Object> delOrdersline(int boid){
        buyorderslineService.deleteByPrimaryKey(boid);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","删除成功");
        map.put("success",true);
        return map;
    }

    //出库  //修改订单和订单详细的状态,结束日期,库管员?,仓库id,并减少库存
    @RequestMapping("/update")
    @ResponseBody
    public Map<String,Object> editOrdersline(Buyorders buyorders,Buyordersline buyordersline, Storedetail storedetail,Storeoper storeoper){
        System.out.println("出库");
        //出库时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String endtime = df.format(new Date());
        System.out.println(endtime);

        //修改订单详细状态
        //查询库管员
        Map<String, Object> map1 = buyorderslineService.empList(buyordersline);
        String name = map1.get("name").toString();
        System.out.println("name:"+name);
        buyordersline.setEndtime(endtime);
        buyordersline.setEnder(name);
        buyordersline.setState("已出库");
        buyorderslineService.updateByPrimaryKey(buyordersline);
        System.out.println("2:"+buyordersline);

        List<Buyordersline> buyorderslines = buyorderslineService.querylinePager(buyordersline);
        boolean b=true;
        for (Buyordersline buyordersline1 : buyorderslines) {
            if("未出库".equals(buyordersline1.getState())){
                b=false;
            }
        }
        if(b){
            //修改订单状态
            buyorders.setEndtime(endtime);
            buyorders.setState("已出库");
            buyordersService.updateByPrimaryKey(buyorders);
            System.out.println("1:"+buyorders);
        }
        //减少库存
        int num=storedetail.getNum()-1;
        storedetail.setNum(num);
        storedetailService.updateByPrimaryKey(storedetail);
        System.out.println("3:"+storedetail);
        //添加库存变动记录
        //员工id?(订单明细和变动记录表)
        storeoper.setType("出库");
        storeoper.setEmpname(name);
        storeoperService.insert(storeoper);
        System.out.println("4:"+storeoper);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("message","出库成功");
        map.put("data",true);
        return map;
    }

    @RequestMapping(value = "/query")
    @ResponseBody
    public Map<String,Object> querylinePager(Buyordersline buyordersline, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Map<String,Object> map=new HashMap<String,Object>();
        List<Buyordersline> buyorderslines = buyorderslineService.querylinePager(buyordersline);
        map.put("data",buyorderslines);
        map.put("code",0);
        map.put("count",pageBean.getTotal());
        map.put("msg","");
        map.put("page",pageBean);
        return map;
    }


}
