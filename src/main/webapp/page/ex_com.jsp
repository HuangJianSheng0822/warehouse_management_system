
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品出库</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
</head>
<body>

<div class="layuimini-container">
    <div class="layuimini-main">
    
  

        <form class="layui-form" action="${pageContext.request.contextPath}/setEx" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">商品编号</label>
                <div class="layui-input-block">
                    <input type="text" name="comId" autocomplete="off" placeholder="商品编号" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">出库数量</label>
                <div class="layui-input-block">
                    <input type="text" name="exNum"  autocomplete="off" placeholder="出库数量" class="layui-input">
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
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '至少得5个字符啊';
                }
            }
        });
        //监听提交
        form.on('submit(demo1)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '若数量充足则可成功取出'
            })
            return true;
        });
    });
</script>

</body>
</html>
