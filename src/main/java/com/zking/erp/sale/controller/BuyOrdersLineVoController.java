package com.zking.erp.sale.controller;

import com.zking.erp.base.util.AjaxUtil;
import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.service.IGoodsService;
import com.zking.erp.basic.vo.GoodsVo;
import com.zking.erp.sale.model.Buyorders;
import com.zking.erp.sale.model.Buyordersline;
import com.zking.erp.sale.service.IBuyordersService;
import com.zking.erp.sale.service.IBuyorderslineService;
import com.zking.erp.sale.vo.BuyOrdersLineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/query")
public class BuyOrdersLineVoController {
  //  int count=1;
    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private IBuyorderslineService buyorderslineService;
    @Autowired
    private IBuyordersService buyordersService;
    public List<BuyOrdersLineVo> OrdersLineVos=new ArrayList<>();

    //第一次初始化表格返回一个空的集合
    @RequestMapping("/BuyOrdersLineVo")
    @ResponseBody
    public Map<String,Object> BuyOrdersLineVos(HttpServletResponse resp){
      return   AjaxUtil.getTableMap(100,OrdersLineVos);
    }

    //增加
    @RequestMapping("/addBuyOrdersLineVos")
    @ResponseBody
    public Map<String,Object> addBuyOrdersLineVos(HttpServletResponse resp){
        Goods goods=new Goods();
        BuyOrdersLineVo buyOrdersLineVo=new BuyOrdersLineVo();
        List<Goods> querygoods = goodsService.querygoods(goods);//查询所有商品
        buyOrdersLineVo.setGoods(querygoods);
        buyOrdersLineVo.setGoodsname(querygoods.get(0).getGname());
        OrdersLineVos.add(buyOrdersLineVo);
        buyOrdersLineVo.setPrice(querygoods.get(0).getOutprice());
        buyOrdersLineVo.setMoney(0f);
        buyOrdersLineVo.setNum(0);
        int count=1;
        for ( BuyOrdersLineVo  vo :OrdersLineVos ) {
            vo.setGoodsid(count++);
        }
        return  AjaxUtil.getTableMap(100,OrdersLineVos);
    }


    //修改商品价格和数量
    @RequestMapping("/editBuyOrdersLineVosPrice")
    @ResponseBody
    public Map<String,Object> editBuyOrdersLineVosPrice(HttpServletResponse resp,int num,int index){
        BuyOrdersLineVo buyOrdersLineVo = OrdersLineVos.get(index - 1);
        Float money=buyOrdersLineVo.getPrice()*num;
        buyOrdersLineVo.setMoney(money);
        buyOrdersLineVo.setNum(num);
        OrdersLineVos.set(index-1,buyOrdersLineVo);
        return  AjaxUtil.getTableMap(100,OrdersLineVos);
    }


    //删除
    @RequestMapping("/deleteBuyOrdersLineVos")
    @ResponseBody
    public Map<String,Object> deleteBuyOrdersLineVos(HttpServletResponse resp,int index){
        OrdersLineVos.remove(index - 1);
        //重新排序
        for( int i=0  ; i<OrdersLineVos.size();i++) {
            OrdersLineVos.get(i).setGoodsid(i + 1);
        }
        return  AjaxUtil.getTableMap(100,OrdersLineVos);
    }

    /**
     *第一次点击下拉框和修改数量的时候
     * @param resp
     * @param index   序号
     * @param goodsid  商品id
     * @return
     */
    @RequestMapping("/editBuyOrdersLineVos")
    @ResponseBody
    public Map<String,Object> editBuyOrdersLineVo(HttpServletResponse resp, int index, final int goodsid){
        Goods goods1 = goodsService.selectByPrimaryKey(goodsid);//根据商品id获取商品
        goods1.setUnit("true");//选中默认商品
        OrdersLineVos.get(index-1).setPrice(goods1.getOutprice());//给价格赋值
        OrdersLineVos.get(index-1).setNum(0);
        OrdersLineVos.get(index-1).setMoney(0f);
        List<Goods> querygoods =  OrdersLineVos.get(index-1).getGoods();//序号为1,list下标为0
        OrdersLineVos.get(index-1).setGoodsname(goods1.getGname());
         for(int i=0 ; i<querygoods.size(); i++){
          querygoods.get(i).setUnit("");//默认清空
          if (querygoods.get(i).getGid()==goodsid){ //如果循环的商品id等于选中的商品id
              querygoods.set(i,goods1);
          }
      }
        OrdersLineVos.get(index-1).setGoods(querygoods);
        return  AjaxUtil.getTableMap(100,OrdersLineVos);
    }


    //提交订单
//增加订单详情
    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> insertBatch(Buyorders buyorders){
        Map<String,Object> map=new HashMap<String,Object>();
        //订单:订单编号,创建日期,订单类型,下单员,销售员,客户,总金额,订单状态,
        //订单详情:商品编号,商品名称,价格,数量,金额,订单状态,订单id
        //List<Buyordersline> list=new ArrayList<Buyordersline>();
        if(OrdersLineVos.size()!=0){
        Buyordersline buyordersline=new Buyordersline();
        float sum=0;
        for ( BuyOrdersLineVo  vo :OrdersLineVos ) {
          sum+=vo.getMoney();
        }
        System.out.println(sum);
        //添加订单
        String bid=UUID.randomUUID().toString().replace("-","");
        buyorders.setBid(bid);
        buyorders.setType("销售");
        buyorders.setState("未出库");
        buyorders.setTotalmoney(sum);
        System.out.println(buyorders);
        buyordersService.insert(buyorders);
        //添加订单详细
        buyordersline.setState("未出库");
        for ( BuyOrdersLineVo  vo :OrdersLineVos ) {
            String boid=UUID.randomUUID().toString().replace("-","");
            buyordersline.setBoid(boid);
            buyordersline.setPrice(vo.getPrice());
            buyordersline.setMoney(vo.getMoney());
            buyordersline.setNum(vo.getNum());
            buyordersline.setGoodsid(vo.getGoodsid());
            buyordersline.setGoodsname(vo.getGoodsname());
            buyordersline.setOrderid(bid);
            buyordersline.setStoreid(vo.getStoreid());
            //buyorders.setTotalmoney(vo.getMoney());
            buyorderslineService.insert(buyordersline);
        }
        System.out.println("1:"+buyordersline);

        OrdersLineVos=new ArrayList<>();
        //System.out.println(list);  //订单编号和商品名称
        map.put("message","添加成功");
        map.put("data",true);
        }else{
            map.put("data",false);
        }
        return map;
    }

}
