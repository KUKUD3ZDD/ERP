
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

    //监听单元格事件
    //table.on('tool(test)',function(obj)){}



    $(document).on('click','#cx',function(){
        selectTable();
    });

    $(document).on('click','#add',function(){
        addOrders();
    });
//初始化表格
    function initTable() {
        // 表格渲染
        table.render({
            elem: '#demo',
            id:"depTableId",
            height: "full",
            url:  projectName+'/buyorders/select', //数据接口
            page: true, //开启分页
            toolbar:'#toolbarDemo'//开启工具栏
            ,cols: [[ //表头
            {field: 'bid', title: '编号', width:"15%", sort: true, fixed: 'left'},
            {field: 'createtime', title: '录入日期', width:"15%"},
            {field: 'endtime', title: '出库日期', width:"15%"},
            {field: 'starter', title: '销售员', width:"9%"},
            {field: 'suname', title: '客户', width:"12%"},
            {field: 'totalmoney', title: '总金额 ', width:"9%"},
            {field: 'state', title: '订单状态', width:"10%"},
        ]]
        });
    }



//查询完重新渲染表格
    function selectTable() {
        var state = $('#state').val();
        var suname= $('#suname').val();
        table.reload('depTableId', {
            id:"depTableId",
            height: "full",
            url:  projectName+'/buyorders/select', //数据接口
            where:{'state':state,'suname':suname}, //设定异步数据接口的参数
            page: true, //开启分页
            toolbar:'#toolbarDemo',//开启工具栏
            cols: [[ //表头
                {field: 'bid', title: '编号', width:80, sort: true, fixed: 'left'},
                {field: 'createtime', title: '录入日期', width:"16%"},
                {field: 'endtime', title: '出库日期', width:"16%"},
                {field: 'starter', title: '销售员', width:"9%"},
                {field: 'suname', title: '客户', width:"12%"},
                {field: 'totalmoney', title: '总金额 ', width:"8%"},
                {field: 'state', title: '订单状态', width:"10%"}
            ]]
        });
    }
    //弹出添加订单页面
    function addOrders() {
        layer.open({
            type: 2,
            content: 'page/sale/addOrders.jsp',
            title:['增加订单','font-size:18px;'],
            maxmin:true,
            shade: 0,
            shadeClose:false,
            offset: 'auto',
            //tips: [1, '#c00'],
            area: ['800px', '400px'],
            //cancel: function(){} //刷新网页
            });
    }

//监听行单击事件
    table.on('row(test)', function(obj){
        var data=obj.data;
        ordersDetail(data);
    });

    //订单详情
    function ordersDetail(data) {
       // console.log(data);
        layer.open({
            type: 2,
            content: 'page/sale/ordersDetail.jsp',
            title: '订单详情',
            maxmin: true,
            shade: 0,
            shadeClose: false,
            //tips: [1, '#c00'],
            area: ['800px', '400px'],
            success: function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(data){
                    // 取到弹出层里的元素，并把内容放进去
                    body.find(".bid").val(data.bid);
                    body.find(".checker").val(data.checker);
                    body.find(".checktime").val(data.checktime);
                    body.find(".creater").val(data.creater);
                    body.find(".createtime").val(data.createtime);
                    body.find(".starter").val(data.starter);
                    body.find(".startime").val(data.startime);
                    body.find(".ender").val(data.ender);
                    body.find(".endtime").val(data.endtime);
                    body.find(".state").val(data.state);
                    body.find(".suname").val(data.suname);
                    body.find(".totalmonmey").val(data.totalmonmey);
                }
            }
        });
    }
});





