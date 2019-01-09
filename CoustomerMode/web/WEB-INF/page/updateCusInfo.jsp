<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form>
       <label>编号</label>
       <input type="text" name="id" readonly value="${cus.id}"/><br>
        <label>姓名</label>
       <input type="text" name="id" readonly value="${cus.cusName}"/><br>
        <label>昵称</label>
       <input type="text" name="id" readonly value="${cus.cusLoginName}"/><br>
        <label>密码</label>
       <input type="text" name="id" readonly value="${cus.cusPassword}"/><br>


   </form>
</body>
</html>
