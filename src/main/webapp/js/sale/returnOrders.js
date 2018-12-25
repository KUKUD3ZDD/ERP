
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

    $(document).on('click','#cx',function(){
        queryTable();
    });

    $(document).on('click','#add',function(){
        addReturnOrders();
    });
//初始化表格
    function initTable() {
        // 表格渲染
        table.render({
            elem: '#demo',
            id:"depTableId",
            height: "full",
            toolbar:'#toolbarDemo',//开启工具栏
            url:  projectName+'/return/returnList', //数据接口
            page: true, //开启分页
            cols: [[ //表头
                {field: 'rid', title: '编号', width:80, sort: true, fixed: 'left'},
                {field: 'createtime', title: '录入日期', width:"15%"},
                {field: 'checktime', title: '审核日期', width:"15%"},
                {field: 'endtime', title: '入库日期', width:"15%"},
                {field: 'creater', title: '下单员', width:"7%"},
                {field: 'checker', title: '审查员', width:"8%"},
                {field: 'suname', title: '客户', width:"8%"},
                {field: 'totalmoney', title: '总金额 ', width:"8%"},
                {field: 'state', title: '订单状态', width:"8%"},
                {title: '操作', width:"8%" ,  fixed: 'right' ,align:'center' , width:"8%", toolbar: '#barDemo'
                }
            ]]
        });
    }

//查询完重新渲染表格
    function queryTable() {
        var state = $('#state').val();
        var suname= $('#suname').val();
        table.reload('depTableId', {
            id:"depTableId",
            height: "full",
            url:   projectName+'/return/returnList', //数据接口
            where:{'state':state,'suname':suname}, //设定异步数据接口的参数
            page: true, //开启分页
            toolbar:'#toolbarDemo',//开启工具栏
            cols: [[ //表头
                {field: 'rid', title: '编号', width:80, sort: true, fixed: 'left'},
                {field: 'createtime', title: '录入日期', width:"15%"},
                {field: 'checktime', title: '审核日期', width:"15%"},
                {field: 'endtime', title: '入库日期', width:"15%"},
                {field: 'creater', title: '下单员', width:"7%"},
                {field: 'checker', title: '审查员', width:"8%"},
                {field: 'suname', title: '客户', width:"7%"},
                {field: 'totalmoney', title: '总金额 ', width:"8%"},
                {field: 'state', title: '订单状态', width:"8%"},
                {title: '操作',  fixed: 'right' ,align:'center' , width:"8%", toolbar: '#barDemo'}
            ]]
        });
    }

/*    $(document).on('click','#check',function(){
        check();
    });*/


    //监听工具条
    table.on('tool(test)', function(obj){
        var data = obj.data;
        var rid=data.rid;
        if(obj.event === 'detail'){
            returnOrdersDetail(data);
        } else if(obj.event === 'check'){
            layer.confirm('确定审核?', function(index){
                check(rid);
                layer.close(index);
            });
        }
    });

    //审核
    function check(rid){
        console.log(rid);
        $.ajax({
            url: projectName + "/return/editReturnOrders",
            data: {'rid': rid},
            dataType: 'json',
            type: 'post',
            async: false,
            success: function (data) {
                if(data.data){
                    layer.msg('审核成功', {icon: 6,time:1500},function(){
                        initTable();      //刷新表格
                    });
                }else{
                    layer.msg('审核失败');
                }
            }
        });
    }

    //监听行单击事件
    /*table.on('row(test)', function(obj){
        var data=obj.data;
       // console.log(data);
        returnOrdersDetail(data);
    });*/

    //退货订单详细
    function returnOrdersDetail(data){
        layer.open({
            type: 2,
            content: 'page/sale/returnOrdersDetail.jsp',
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
                    body.find(".rid").val(data.rid);
                    body.find(".checker").val(data.checker);
                    body.find(".checktime").val(data.checktime);
                    body.find(".creater").val(data.creater);
                    body.find(".createtime").val(data.createtime);
                    body.find(".ender").val(data.ender);
                    body.find(".endtime").val(data.endtime);
                    body.find(".state").val(data.state);
                    body.find(".suname").val(data.suname);
                }
            }
        });
    }



    //添加退货销售订单
    function addReturnOrders() {
            layer.open({
                type: 2,
                content: 'page/sale/addReturnOrders.jsp',
                title:'增加订单',
                maxmin:true,
                shade: 0,
                shadeClose:false,
                //tips: [1, '#c00'],
                area: ['800px', '400px'],
                //cancel: function(){} //刷新网页
            });
    }


});





