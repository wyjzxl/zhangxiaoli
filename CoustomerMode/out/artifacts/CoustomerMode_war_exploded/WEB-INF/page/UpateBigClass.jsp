<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="<%=request.getContextPath() %>/" />
    <%@include file="layUI.jsp"%>
    <style>
        input{
            border-radius: 5px;
            height: 30px;
            font-size: 15px;
            padding-left: 5px;
        }
        form{
            width: 80%;
            margin: auto;
            padding: 40px;
        }
    </style>
</head>
<body>
    <form action="/doBigClass?action=updateById" method="post">
        <label>编号:</label><input type="text" name="id" value="${param.id}" readonly/><br>
        <label>大分类名称:</label><input type="text" name="bigName" value="${param.bigName}" /><br>
        <label>描述信息:</label><input type="text" name="bigText" value="${param.bigText}" /><br>
        <input type="submit" value="保存修改" class="layui-btn"/>
    </form>
</body>
</html>
