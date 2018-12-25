<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/21/021
  Time: 16:13
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
    <script src="${ctx}/js/sale/ordersLineDetail.js"></script>
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<form class="layui-form">
    <table class="query_form_table" lay-filter="editFrom">
        <tr>
            <th>订单id</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="bid" id="bid" class="layui-input bid"></td>
            <th>订单详细id</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="boid" class="layui-input boid" id="boid"></td>
        </tr>
        <tr>
            <th>商品id</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="goodsid" id="goodsid" class="layui-input goodsid"></td>
            <th>商品名称</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="goodsname" class="layui-input goodsname" id="goodsname"></td>
        </tr>
        <tr>
            <th>数量</th>
            <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="num" class="layui-input num" id="num"></td>
            <th>仓库</th>
            <td>
                <select name="sid" lay-filter="aihao" id="sid">
                    <option value="">--请选择--</option>
                </select>
            </td>
        </tr>
    </table>
</br>
&nbsp;<input class="layui-btn layui-btn-normal layui-btn-sm" id="out" value="出库" size="10px;"></input>
</form>
</body>
</html>
