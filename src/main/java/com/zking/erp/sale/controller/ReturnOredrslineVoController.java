package com.zking.erp.sale.controller;

import com.zking.erp.base.util.AjaxUtil;
import com.zking.erp.basic.model.Goods;
import com.zking.erp.basic.service.IGoodsService;
import com.zking.erp.sale.model.*;
import com.zking.erp.sale.service.IReturnordersService;
import com.zking.erp.sale.service.IReturnorderslineService;
import com.zking.erp.sale.vo.ReturnOrderslineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RequestMapping("/ordersVo")
@Controller
public class ReturnOredrslineVoController {
    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private IReturnordersService returnordersService;
    @Autowired
    private IReturnorderslineService returnorderslineService;


    public List<ReturnOrderslineVo> ReturnOrdersLineVos=new ArrayList<>();

    //第一次初始化表格返回一个空的集合
    @RequestMapping("/ReturnOrdersLineVo")
    @ResponseBody
    public Map<String,Object> BuyOrdersLineVos(HttpServletResponse resp){
        return   AjaxUtil.getTableMap(100,ReturnOrdersLineVos);
    }

    //增加
    @RequestMapping("/addReturnOrdersLineVos")
    @ResponseBody
    public Map<String,Object> addBuyOrdersLineVos(HttpServletResponse resp){
        Goods goods=new Goods();
        ReturnOrderslineVo returnOrderslineVo=new ReturnOrderslineVo();
        List<Goods> querygoods = goodsService.querygoods(goods);//查询所有商品
        returnOrderslineVo.setGoods(querygoods);
        returnOrderslineVo.setGoodsname(querygoods.get(0).getGname());
        ReturnOrdersLineVos.add(returnOrderslineVo);
        returnOrderslineVo.setPrice(querygoods.get(0).getOutprice());
        returnOrderslineVo.setMoney(0f);
        returnOrderslineVo.setNum(0);
        int count=1;
        for ( ReturnOrderslineVo  vo :ReturnOrdersLineVos ) {
            vo.setGoodsid(count++);
        }
        return  AjaxUtil.getTableMap(100,ReturnOrdersLineVos);
    }


    //修改商品价格和数量
    @RequestMapping("/editBuyOrdersLineVosPrice")
    @ResponseBody
    public Map<String,Object> editBuyOrdersLineVosPrice(HttpServletResponse resp,int num,int index){
        ReturnOrderslineVo returnOrderslineVo = ReturnOrdersLineVos.get(index - 1);
        Float money=returnOrderslineVo.getPrice()*num;
        returnOrderslineVo.setMoney(money);
        returnOrderslineVo.setNum(num);
        ReturnOrdersLineVos.set(index-1,returnOrderslineVo);
        return  AjaxUtil.getTableMap(100,ReturnOrdersLineVos);
    }


    //删除
    @RequestMapping("/deleteBuyOrdersLineVos")
    @ResponseBody
    public Map<String,Object> deleteBuyOrdersLineVos(HttpServletResponse resp,int index){
        ReturnOrdersLineVos.remove(index - 1);
        //重新排序
        for( int i=0  ; i<ReturnOrdersLineVos.size();i++) {
            ReturnOrdersLineVos.get(i).setGoodsid(i + 1);
        }
        return  AjaxUtil.getTableMap(100,ReturnOrdersLineVos);
    }

    /**
     *第一次点击下拉框和修改数量的时候
     * @param resp
     * @param index   序号
     * @param goodsid  商品id
     * @return
     */
    @RequestMapping("/editReturnOrdersLineVos")
    @ResponseBody
    public Map<String,Object> editBuyOrdersLineVo(HttpServletResponse resp, int index, final int goodsid){
        Goods goods1 = goodsService.selectByPrimaryKey(goodsid);//根据商品id获取商品
        goods1.setUnit("true");//选中默认商品
        ReturnOrdersLineVos.get(index-1).setPrice(goods1.getOutprice());//给价格赋值

        ReturnOrdersLineVos.get(index-1).setNum(0);
        List<Goods> querygoods =  ReturnOrdersLineVos.get(index-1).getGoods();//序号为1,list下标为0
        ReturnOrdersLineVos.get(index-1).setGoodsname(goods1.getGname());
        for(int i=0 ; i<querygoods.size(); i++){
            querygoods.get(i).setUnit("");//默认清空
            if (querygoods.get(i).getGid()==goodsid){ //如果循环的商品id等于选中的商品id
                querygoods.set(i,goods1);
            }
        }
        ReturnOrdersLineVos.get(index-1).setGoods(querygoods);
        return  AjaxUtil.getTableMap(100,ReturnOrdersLineVos);
    }


    //提交订单
//增加订单详情
    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> insertBatch(Returnorders returnorders){
        System.out.println("lululululu");
        Map<String,Object> map=new HashMap<String,Object>();
        //订单:订单编号,创建日期,订单类型,下单员,销售员,客户,总金额,订单状态,
        //订单详情:商品编号,商品名称,价格,数量,金额,订单状态,订单id
        //List<Buyordersline> list=new ArrayList<Buyordersline>();
        if(ReturnOrdersLineVos.size()!=0){
        Returnordersline returnordersline=new Returnordersline();
        float sum=0;
        for ( ReturnOrderslineVo  vo :ReturnOrdersLineVos ) {
            sum+=vo.getMoney();
        }
        //添加退货订单
          String bid= UUID.randomUUID().toString().replace("-","");
        returnorders.setRid(bid);
        returnorders.setType("销售");
        returnorders.setState("未审核");
        returnorders.setTotalmoney(sum);
        System.out.println(returnorders);
        returnordersService.insert(returnorders);
        //添加退货订单详细
        returnordersline.setState("未入库");
        for ( ReturnOrderslineVo  vo :ReturnOrdersLineVos ) {
            String boid=UUID.randomUUID().toString().replace("-","");
            returnordersline.setRoid(boid);
            returnordersline.setPrice(vo.getPrice());
            returnordersline.setMoney(vo.getMoney());
            returnordersline.setNum(vo.getNum());
            returnordersline.setGoodsid(vo.getGoodsid());
            returnordersline.setGoodsname(vo.getGoodsname());
            returnordersline.setOrderid(bid);
            returnordersline.setStoreid(vo.getStoreid());
            //buyorders.setTotalmoney(vo.getMoney());
            returnorderslineService.insert(returnordersline);
        }
        System.out.println("1:"+returnordersline);
        //list.add(buyordersline);
        //System.out.println(list);  //订单编号和商品名称
        /* buyorderslineService.insertBatch(list);*/
       ReturnOrdersLineVos=new ArrayList<>();
        map.put("message","添加成功");
        map.put("data",true);
        }else{
            map.put("data",false);
        }
        return map;
    }

}
