
layui.use(['form', 'layer', 'laydate','element','jquery','table'], function(){
    // 项目名
    var projectName = $('#projectName').val();
    // 操作对象
    var form = layui.form,    //表单
        layer = layui.layer,  //弹出框
        laydate=layui.laydate,//日期与时间选择
        element=layui.element,//常用元素
        table = layui.table;  //数据表格

    initTable();

//初始化表格
    function initTable() {
        var rid=$("#rid").val();
        // 表格渲染
        table.render({
            elem: '#demo2',
            id:"depTableId",
            height: "full",
            where:{'orderid':rid}, //设定异步数据接口的参数
            url: projectName+'/returnordersline/query', //数据接口
            page: false, //开启分页
            cols: [[ //表头
                {field: 'roid', title: '编号', width:100, sort: true, fixed: 'left',event:'setDetail'},
                {field: 'goodsid', title: '商品编号', width:100},
                {field: 'goodsname', title: '商品名称', width:100},
                {field: 'price', title: '价格', width:90},
                {field: 'num', title: '数量', width:90},
                {field: 'money', title: '金额', width:80},
                {field: 'state', title: '状态', width:100},
            ]]
        });
    }

    //监听行单击事件
   table.on('row(test2)', function(obj){
        var data=obj.data;
        if(data.state=='已入库'){
          layer.alert("该订单已入库");
        }else {
            ordersLineDetail(data);
        }
    });

    function ordersLineDetail(data){
        console.log(11111);
        layer.open({
            type: 2,
            content: 'page/sale/returnordersLineDetail.jsp',
            title: '订单明细',
            maxmin: true,
            shade: 0,
            shadeClose: false,
            //tips: [1, '#c00'],
            area: ['500px', '350px'],
            success: function(layero, index) {
                var body = layui.layer.getChildFrame('body', index);
                if (data) {
                    // 取到弹出层里的元素，并把内容放进去
                    body.find(".goodsid").val(data.goodsid);
                    body.find(".goodsname").val(data.goodsname);
                    body.find(".num").val(data.num);
                    body.find(".rid").val(data.orderid);
                    body.find(".roid").val(data.roid);
                }
            }
        });
    }


});
