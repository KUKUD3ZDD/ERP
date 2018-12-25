layui.use(['form', 'layer', 'laydate','element','jquery','table'], function() {
    // 项目名
    var projectName = $('#projectName').val();
    // 操作对象
    var form = layui.form,    //表单
        layer = layui.layer,  //弹出框
        laydate = layui.laydate,//日期与时间选择
        element = layui.element,//常用元素
        table = layui.table;  //数据表格

    initStore();

    //初始仓库下拉框
    function initStore(){
        $.get(projectName+'/store/querystore',{type:1,},function(data){
            //console.log(data);
            var clientname="";
            if(data.data!=null){
                $.each(data.data,function(index,item){
                    //console.log(item);
                    if(data.sid){
                        clientname+="<option value='"+item.sname+"'>"+item.sname+"</option>";
                    }else{
                        clientname+="<option value='"+item.sname+"'>"+item.sname+"</option>";
                    }
                });
                $("select[name='sid']").append(clientname);
                //append后重新渲染
                form.render();
            }
        });
    }

    $(document).on('click','#inStore',function(){
        inStore();
    });

    //出库
    function inStore(){
        //修改订单和订单详细的状态,结束日期,库管员,仓库id,并减少库存
        var rid=$("#rid").val();
        var roid=$("#roid").val();
        var storename=$("#sid").val();
        var goodsid=$("#goodsid").val();
        var goodsname=$("#goodsname").val();
        var num=$("#num").val();
        console.log(storename);
        if(""==storename){
            layer.msg("请先选择仓库");
        }else {
            $.ajax({
                url: projectName + "/returnordersline/editReturnOrdersline",
                data: {
                    'rid': rid,
                    'roid': roid,
                    'goodsid': goodsid,
                    'storename': storename,
                    'num': num,
                    'goodsname': goodsname,
                    'orderid':rid
                },
                dataType: 'json',
                type: 'post',
                async: false,
                success: function (data) {
                    if (data.data) {
                        layer.msg("入库成功", {icon: 6,time:1500},function(){
                            layer.close(layer.index);
                        });
                    } else {
                        layer.msg('入库失败');
                    }
                }
            });
        }
    }

});