<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品跟踪</title>
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
            <legend>搜索信息</legend>
            <div style="margin: 10px 10px 10px 10px">
               
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">商品编号</label>
                            <div class="layui-input-inline">
                                <input type="text" id="comId" name="comId" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <button id="sub" type="submit" class="layui-btn layui-btn-primary"  lay-submit lay-filter="data-search-btn"><i class="layui-icon"></i> 搜 索</button>
                        </div>
                    </div>
           
            </div>
        </fieldset>
       
    </div>
</div>

<script src="${pageContext.request.contextPath}/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use(['form', 'layedit', 'laydate','jquery'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate
            ,$=layui.$;
        // 监听搜索操作
        $("#sub").on("click",function(){

        	var comId = $("#comId").val();
            window.localStorage.setItem("comId",comId)
            var index = layer.open({
                title: '详情',
                type: 2,
                shade: 0.2,
                maxmin:true,
                shadeClose: true,
                area: ['100%', '100%'],
                content: 'detail.jsp',
            });
            $(window).on("resize", function () {
                layer.full(index);
            });
        })
   
    });
</script>

</body>
</html>
