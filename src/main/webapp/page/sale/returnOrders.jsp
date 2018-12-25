<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/18/018
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <script src="${ctx}/js/sale/returnOrders.js"></script>
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<div class="layui-form-item" style="padding: -20px;">
    <label class="layui-form-label">订单状态:</label>
    <form class="layui-form" action="">
    <div class="layui-input-inline">
        <select name="state" lay-filter="aihao" id="state">
            <option value="">---请选择---</option>
            <option value="未审核">未审核</option>
            <option value="已审核">已审核</option>
            <option value="已入库">已入库</option>
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
<table id="demo" lay-filter="test">  </table>
<button class="layui-btn layui-btn-normal" id="add">销售退货登记</button>

<script type="text/html" id="barDemo">
    {{#  if(d.state == '未审核'){ }}
    <a class="layui-btn layui-btn-xs" lay-event="check">审核</a>
    {{#  } else if(d.state == '已审核'){ }}
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
    {{#  } else if(d.state == '已入库'){ }}
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
    {{#  } }}
</script>

</body>
</html>
