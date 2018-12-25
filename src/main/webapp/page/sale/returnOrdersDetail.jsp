<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/19/019
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css">
    <script src="${ctx}/js/sale/returnOrderDetail.js"></script>
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<form class="layui-form">
    <table class="query_form_table" lay-filter="editFrom">
        <tr>
            <th>流水号</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="rid" id="rid" class="layui-input rid"></td>
            <th>供应商</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="suname" class="layui-input suname"></td>
        </tr>
        <tr>
            <th>状态</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="state" class="layui-input state"></td>
            <th>下单人</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="creater" class="layui-input creater"></td>
        </tr>
        <tr>
            <th>审核人</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="checker" class="layui-input checker"></td>
        </tr>
        <tr>
            <th>库管员</th>
            <td><input name="ender" style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' class="layui-input ender"></td>
            <th>下单日期</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="createtime" class="layui-input createtime">
            </td>
        </tr>
        <tr>
            <th>入库日期</th>
            <td><input id="dd" name="endtime" style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' class="layui-input endtime"></td>
            <th>审核日期</th>
            <td colspan="3"><input style="border: none;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="checktime" class="layui-input checktime"></td>
        </tr>
    </table>
</form>
<br/>
<table id="demo2" lay-filter="test2" lay-data="{id: 'depTableId'}"></table>
</body>
</html>
