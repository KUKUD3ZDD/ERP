<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../common/head.jsp"/>
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css">
    <script src="${ctx}/js/common/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${ctx}/js/common/layui/layui.js"></script>
    <script src="${ctx}/js/sale/addOrders.js"></script>
    <style>
        body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, textarea, p, blockquote, th, td {
            margin: 0;
            padding: 0;
            list-style: none;
            border: none;
        }
        html, body {
            position: relative;
            background: #EDF0F5;
            color: #505458;
            font-family: "微软雅黑";
            font-size: 14px;
        }
        .layui-table thead tr {
            background-color: #fff;
        }
        .laytable-cell-1-sel {
            overflow: inherit;
        }
        .layui-table-cell span {
            font-weight: bold;
        }

        .layui-table-body tbody tr {
            height: 50px;
        }
        .selectDemo {
            height: 30px;
            border: 1px solid #e6e6e6;
            border-radius: 4px;
        }
    </style>
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
<input type="button" class="layui-btn layui-btn-normal"  id="addOrders"   value="提交订单" />
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
