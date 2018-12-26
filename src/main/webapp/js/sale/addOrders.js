
var table;
//序号
var index;
layui.use(['form', 'layer', 'laydate','element','jquery','table'], function(){
    // 项目名
    var projectName = $('#projectName').val();
    // 操作对象
    var form = layui.form,    //表单
        layer = layui.layer,  //弹出框
        laydate=layui.laydate,//日期与时间选择
        element=layui.element;//常用元素
        table = layui.table;  //数据表格

    initSupplier();



        // 表格渲染
        table.render({
            elem: '#demo2',
            id:"depTableId",
            height: "full",
            page: false, //开启分页
            url:projectName+'/query/BuyOrdersLineVo',
            toolbar:'#toolbarDemo',//开启工具栏
            totalRow: true,
            cols: [[ //表头
                {field: 'goodsid', title: '序号',  width:80, fixed: 'left', unresize: true, sort: true, totalRowText: '合计'},
                {field: 'goodsname', title: '商品名称', width:300,templet:'#initGoods'},
                {field: 'price', title: '价格', width:90},
                {field: 'num', title: '数量', width:90,edit:true},
                {field: 'money', title: '金额', width:80, totalRow: true,sort: true },
                {field: '', title: '操作', width:100,toolbar: '#barDemo'},
            ]],
        });


    //监听工具条  删除
    table.on('tool(tabletest)', function(obj){
        var data = obj.data;
           layer.confirm('真的删除行么', function(index){
                $.ajax({
                    url : projectName+"/query/deleteBuyOrdersLineVos",
                    data : {'index':data.goodsid},
                    dataType : 'json',
                    type : 'post',
                    async : false,
                    success:function (data) {
                        obj.del();
                        layer.close(index);
                        table.reload('depTableId', {
                            url:projectName+'/query/BuyOrdersLineVo'
                        });
                    }
                });
            });
  });

    //修改数量
    table.on('edit(tabletest)', function(obj){ //注：edit是固定事件名，test是table原始容器的属性 lay-filter="对应的值"
        //console.log(obj.data); //所在行的所有相关数据
          var price=obj.data.price;
          var num=obj.data.num;
         table.reload('depTableId', {
         url:'query/editBuyOrdersLineVosPrice?num='+num+'&index='+obj.data.goodsid
        });
    });

     //获取序号
    table.on('row(tabletest)', function(obj){
        index=obj.data.goodsid;//给index赋值序号
    });

    //点击增加按钮
    table.on('toolbar(tabletest)', function(obj){
        switch(obj.event){
            case 'add':
                table.reload('depTableId', {
                    url:projectName+'/query/addBuyOrdersLineVos'
                });
                break;
        };
    });


    //初始客户
    function initSupplier(){
        $.get(projectName+'/Supplier/querysupplier',{type:1,},function(data){
            //console.log(data);
         var clientname="";
         if(data.data!=null){
             $.each(data.data,function(index,item){
                 //console.log(item);
                 if(data.suid){
                     clientname+="<option value='"+item.suid+"'>"+item.suname+"</option>";
                 }else{
                     clientname+="<option value='"+item.suid+"'>"+item.suname+"</option>";
                 }
             });
             $("select[name='supplierid']").append(clientname);
             //append后重新渲染
             form.render();
         }
        });


    }

    //提交订单
    $(document).on('click','#addOrders',function(){
        console.log(123);
        var suname=$('#supplierid').val();
        if(""==suname){
            layer.msg("请先选择客户");
    }else {
            $.ajax({
                url: projectName + "/query/add?supplierid="+suname,
                dataType: 'json',
                type: 'post',
                async: false,
                success:function(data){
                    console.log(data);
                    if(data.data){
                        layer.alert('添加订单成功');
                        table.reload('depTableId', {
                            url:projectName+'/query/BuyOrdersLineVo'
                        });
                    }else{
                      layer.msg('请先添加订单');
                    }
                }
            });
        }
    });
});


//点击商品名称下拉框方法(放在方法外面)
function  selectDemo(id) {
    var goodsid=$(id).val();//获取商品Id
    table.reload('depTableId', {
        url:'query/editBuyOrdersLineVos?index='+index+'&goodsid='+goodsid
    });
}
