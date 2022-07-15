<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <meta charset="utf-8">
    <title>编辑</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">

       <form class="layui-form" action="${pageContext.request.contextPath}/updateCom" method="post">
            <div class="layui-form-item" hidden>
                <label class="layui-form-label">商品编号</label>
                <div class="layui-input-block">
                    <input type="text" id="comId" name="comId" autocomplete="off" placeholder="商品编号" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">商品名称</label>
                <div class="layui-input-block">
                    <input type="text" id="comName" name="comName"  autocomplete="off" placeholder="商品名称" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">商品数量</label>
                <div class="layui-input-block">
                    <input type="text" id="comNum" name="comNum"  autocomplete="off" placeholder="商品数量" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">商品类型</label>
                <div class="layui-input-block">
                    <select name="comKind" lay-filter="aihao">
                        <option value="食品">食品</option>
                        <option value="服装" selected="">服装</option>
                        <option value="玩具">玩具</option>
                        <option value="图书">图书</option>
                        <option value="家电">家电</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">是否易碎</label>
                <div class="layui-input-block">
                    <input type="radio" name="fragile" value="是" title="是" checked="">
                    <input type="radio" name="fragile" value="否" title="否">
                </div>
            </div>
            
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form','jquery'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;
        $("#comId").val(parent.comId)
        $("#comName").val(parent.comName)
        $("#comNum").val(parent.comNum)
        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                // 关闭弹出层
                layer.close(index);
                var iframeIndex = parent.layer.getFrameIndex(window.name);
                parent.layer.close(iframeIndex);
            });

            return false;
        });

    });
</script>
</body>
</html>