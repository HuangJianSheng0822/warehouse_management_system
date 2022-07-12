
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>出库日志</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">
          <fieldset class="table-search-fieldset">
            <legend id="comId">出库详情</legend>
            <span>商品号</span><span>商品名称</span>
            <span>入库时间</span><span>入库数量</span>
         
        </fieldset>
        <table class="layui-hide" id="currentTableId" lay-filter="currentTableFilter"></table>
 
    </div>
</div>
<script src="${pageContext.request.contextPath}/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form', 'table'], function () {
        var $ = layui.jquery,
            form = layui.form,
            table = layui.table;
        let item = window.localStorage.getItem("comId");
        table.render({
            elem: '#currentTableId',
            url: '${pageContext.request.contextPath}/getEx?comId='+item,
            toolbar: '#toolbarDemo',
            defaultToolbar: ['filter', 'exports', 'print', {
                title: '提示',
                layEvent: 'LAYTABLE_TIPS',
                icon: 'layui-icon-tips'
            }],
            cols: [[
     
                {field: 'exId',  title: '序号'},
                {field: 'exTime',  title: '出库时间'},
                {field: 'exNum',  title: '出库数量'},
            ]],
            limits: [150],
            limit: 150,
            page: true,
            skin: 'line'
        });

     
    });
</script>

</body>
</html>