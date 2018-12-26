layui.use(['form', 'layer', 'laydate','element','jquery','table'], function() {
    // 项目名
    var projectName = $('#projectName').val();

    // 操作对象
    var form = layui.form,    //表单
        layer = layui.layer,  //弹出框
        laydate = layui.laydate,//日期与时间选择
        element = layui.element,//常用元素
        table = layui.table;  //数据表格

    initTable();
    laydate.render({
        elem: '#date'
        ,type: 'datetime'
       // ,range: true //或 range: '~' 来自定义分割字符
    });

    $(document).on('click','#cx',function(){
        selectTable();
    });

//初始化表格
    function initTable() {
        var date=$('#date').val();
        console.log(date);

        // 表格渲染
       /* table.render({
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
        });*/
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

});