<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20/020
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <script src="${ctx}/js/sale/addReturnOrders.js"></script>
</head>

<body>
<input type="hidden" id="projectName" value="${ctx}">
<form class="layui-form">
    <div class="layui-form-item" style="padding: -20px;">
        <label class="layui-form-label">客户:</label>
        <div class="layui-input-inline">
            <select name="supplierid" lay-filter="aihao" id="supplierid">
                <option value="">---请选择---</option>
            </select>
        </div>
    </div>


    <table class="layui-table" lay-filter="tabletest" id="demo2">
    </table>
    <input class="layui-btn layui-btn-normal" lay-event="addOrders" id="addOrders" value="提交订单" size="10px;"></input>
    <%--toolbar工具栏--%>
    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <button class="layui-btn layui-btn-normal" lay-event="add">增加</button>
        </div>
    </script>

    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>

    <%--初始化商品下拉框--%>
    <script type="text/html" id="initGoods">
        <select lay-filter="selDome" class="selectDemo" data-id="{{d.id}}" lay-ignore onchange="selectDemo(this)">
            {{# layui.each(d.goods, function(index, item){ }}
            <option value="{{item.gid}}"    {{ item.unit == 'true' ? 'selected' : ''  }}  >{{item.gname}}</option>
            {{# }); }}
        </select>
    </script>

</form>

</body>
</html>
