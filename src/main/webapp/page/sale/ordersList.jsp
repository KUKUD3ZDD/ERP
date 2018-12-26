<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/17/017
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <script src="${ctx}/js/sale/ordersList.js"></script>
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<div class="layui-form-item" style="padding: -20px;">
    <label class="layui-form-label">订单状态:</label>
    <form class="layui-form" action="">
    <div class="layui-input-inline">
        <select name="state" lay-filter="aihao" id="state">
            <option value="">---请选择---</option>
            <option value="未出库">未出库</option>
            <option value="已出库">已出库</option>
        </select>
    </div>
    </form>
    <label class="layui-form-label">客户:</label>
    <div class="layui-input-inline">
        <input type="text" id="suname" name="suname" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
    <button id="cx" class="layui-btn layui-btn-normal" >
    <i class="layui-icon" style=" color:white;">&#xe615;搜索</i>
</button>
</div>
<table id="demo" lay-filter="test"></table>
<button class="layui-btn layui-btn-normal" id="add">录入销售订单</button>
</body>
</html>
