<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <base href="<%=request.getContextPath() %>/" />
    <%@include file="layUI.jsp"%>
</head>
<body>
<c:choose>

    <c:when test="${not empty sessionScope.BigClass}">
        ${error}
        <table id="stu" width="90%" class="layui-table" lay-size="sm">
            <tr>
                <th>编号</th>
                <th>大分类名称</th>
                <th>大分类描述</th>
                <th colspan="2">操作</th>
            </tr>
            <c:forEach items="${sessionScope.BigClass}" var="bigclass">
                <tr>
                    <td>${bigclass.id}</td>
                    <td>${bigclass.bigName}</td>
                    <td>${bigclass.bigText}</td>
                    <td><a class="layui-btn layui-btn-sm" href="doBigClass?action=delById&id=${bigclass.id}">删除</a></td>
                    <td><a class="layui-btn layui-btn-sm" href="page/UpateBigClass.jsp?id=${bigclass.id}&bigName=${bigclass.bigName}&bigText=${bigclass.bigText}">修改</a></td>
s                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h3>暂无大分类信息</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
