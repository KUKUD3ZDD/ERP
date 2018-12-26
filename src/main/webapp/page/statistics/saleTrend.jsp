<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25/025
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <script src="${ctx}/js/statistics/saleTrend.js"></script>
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<div style="padding-left: 200px;">
    <label>年份选择:</label>
    <div class="layui-inline"> <!-- 注意：这一层元素并不是必须的 -->
        <input type="text" class="layui-input" id="date">
    </div>
    <button id="cx" class="layui-btn layui-btn-normal" >
        <i class="layui-icon" style=" color:white;">&#xe615;查询</i>
    </button>
</div>


</body>
</html>
