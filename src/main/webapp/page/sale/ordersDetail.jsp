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
    <script src="${ctx}/js/sale/ordersDetail.js"></script>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<input type="hidden" id="projectName" value="${ctx}">
<form class="layui-form">
<table class="query_form_table" lay-filter="editFrom">
    <tr>
        <th>流水号</th>
        <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="bid" id="bid" class="layui-input bid"></td>
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
        <th>确认人</th>
        <td><input style="border: none; text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="starter" class="layui-input starter"></td>
    </tr>
    <tr>
        <th>库管员</th>
        <td><input name="ender" style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' class="layui-input ender"></td>
        <th>下单日期</th>
        <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="createtime" class="layui-input createtime">
        </td>
    </tr>
    <tr>
        <th>确认日期</th>
        <td><input name="startime" style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' class="layui-input startime"></td>
        <th>入库日期</th>
        <td><input id="dd" name="endtime" style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' class="layui-input endtime"></td>
    </tr>
    <tr>
        <th>审核日期</th>
        <td colspan="3"><input style="border: none;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' name="checktime" class="layui-input checktime"></td>
    </tr>
</table>
</form>
<br/>

<table id="demo2" lay-filter="test2" lay-data="{id: 'depTableId'}"></table>
<!--订单明细窗口(出库)-->
<%--<script type="text/html" id="editDiv">
    <form class="layui-form">
        <table class="query_form_table" lay-filter="editFrom">
            <tr>
                <th>商品id</th>
                <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="goodsid" id="goodsid" class="layui-input goodsid"></td>
                <th>商品名称</th>
                <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="goodsname" class="layui-input goodsname"></td>
            </tr>
            <tr>
                <th>数量</th>
                <td><input style="border: none;text-align: center;width:100%;height:100%;background-color:#eeeeff;" readonly='readonly;' NAME="num" class="layui-input num"></td>
                <th>仓库</th>
                <td>
                    <select name="sid" lay-filter="aihao" id="sid">
                        <option value="">--请选择--</option>
                    </select>
                </td>
            </tr>
        </table>
        </br>
        &nbsp;<button class="layui-btn layui-btn-normal layui-btn-sm" id="out">出库</button>
    </form>
</script>--%>
</body>
</html>
