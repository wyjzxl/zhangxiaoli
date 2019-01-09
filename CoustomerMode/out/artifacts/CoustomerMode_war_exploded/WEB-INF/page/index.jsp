<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>贵美商城后台管理系统</title>
    <base href="<%=request.getContextPath() %>/" />
    <%@include file="layUI.jsp"%>
    <link rel="stylesheet" href="static/css/index.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div id="head"  class="layui-header">
        <div class="layui-logo">
            <img style="margin-left: 15px" width="260px" src="static/back/Image/logo_1.png">
        </div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="static\back\Image\1.png" class="layui-nav-img">
                    ${superUser.userName}
                </a>
                <dl class="layui-nav-child">
                    <dd><a target="iframe_context" href="doStu?action=queryById&stuId=${sessionScope.Student.stuId}">基本资料</a></dd>
                    <dd><a target="iframe_context" href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a id="outPage" href="" class="layui-icon ">&#x1007;</a></li>
        </ul>
    </div>

    <div  class="layui-side layui-bg-black">
        <div class="layui-side-scroll" id="left1">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul id="left2" class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="layui-icon" target="iframe_context" href="/customer/queryAll" style="color:#9FC105">&#xe770;&nbsp;&nbsp;顾客管理</a>
                    <dl class="layui-nav-child">
                        <!--a标签中写ifream的name 则点击超链接 就会在指定name的ifream中显示-->
                        <dd><a target="iframe_context"  href="/customer/queryAll">查询顾客</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="layui-icon" href="javascript:;" style="color:#9FC105">&#xe621;&nbsp;&nbsp;分类管理</a>
                    <dl class="layui-nav-child">
                        <dd><a target="iframe_context" href="doBigClass?action=queryAll">大分类管理</a></dd>
                        <dd><a target="iframe_context" href="javascript:;">小分类管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="layui-icon" href="javascript:;" style="color:#9FC105">&#xe621;&nbsp;&nbsp;商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a target="iframe_context" href="javascript:;">查询商品</a></dd>
                        <dd><a target="iframe_context" href="javascript:;">添加商品</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="layui-icon" href="javascript:;" style="color:#9FC105">&#xe66e;&nbsp;&nbsp;订单管理</a>
                    <dl class="layui-nav-child">
                        <dd><a target="iframe_context" href="javascript:;">查询订单详情</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="layui-icon" href="javascript:;" style="color:#9FC105">&#xe621;&nbsp;&nbsp;公告管理</a>
                    <dl class="layui-nav-child">
                        <dd><a target="iframe_context" href="javascript:;">查询公告</a></dd>
                        <dd><a target="iframe_context" href="javascript:;">添加公告</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="layui-icon" href="javascript:;" style="color:#9FC105">&#xe770;&nbsp;&nbsp;商家管理</a>
                    <dl class="layui-nav-child">
                        <dd><a target="iframe_context" href="javascript:;">查询商家</a></dd>
                        <dd><a target="iframe_context" href="javascript:;">添加商家</a></dd>
                    </dl>
                </li>

            </ul>
        </div>
    </div>

    <div id="main" class="layui-body">
        <%-- 通过使用静态包含将指定的jsp页面包含到当前页面中--%>
        <div class="bannerWarp">
            <jsp:include page="banner.jsp"/>
        </div>

        <!-- 内容主体区域 -->
        <div style="padding: 15px;">

            <iframe name="iframe_context" frameborder="0" id="context" src="doCustomer?action=queryAll&pageNumber=1"  ></iframe>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © www.kgc.com - 贵美商城
    </div>
</div>

<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            ,width: '100%' //设置容器宽度
            ,arrow: 'always' //始终显示箭头
            ,height:'200px'
            /*  ,anim: 'fade' //切换动画方式*/
            ,interval:'3000'
        });
    });
</script>
</body>
</html>