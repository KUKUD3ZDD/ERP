layui.use(['form', 'layer', 'laydate','element','jquery','table'], function() {
    // 项目名
    var projectName = $('#projectName').val();

    // 操作对象
    var form = layui.form,    //表单
        layer = layui.layer,  //弹出框
        laydate = layui.laydate,//日期与时间选择
        element = layui.element,//常用元素
        table = layui.table;  //数据表格

    laydate.render({
        elem: '#date'
        ,type: 'year'
    });

});