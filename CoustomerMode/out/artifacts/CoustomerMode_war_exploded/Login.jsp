<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>贵美登录</title>
    <base href="<%=request.getContextPath()%>/" />
    <style>
        body{
            margin: 0px;
            background-color: #C0C1BF;
        }
        .login{
            width: 510px;
            height: 330px;
            background-image: url(" static/images/login2.PNG");
            /*设置绝对路径控制div的位置*/
            position: absolute;
            left: 380px;
            top: 280px;
        }
        input[name="userLoginName"],input[name="userPassword"]{
            width: 213px;
            height: 30px;
            background-color: rgba(154, 154, 147, 0);
            border: 1px solid rgba(154, 154, 147, 0);
            color: #ffffff;
        }
        input[name="userLoginName"]{
            position: relative;
            top: 136px;
            left: 157px;
        }
        input[name="userPassword"]{
            position: relative;
            top: 156px;
            left: 157px;
        }
        .post{
            position: relative;
            top: 166px;
            left: 182px;
            color: #ffffff;
            font-weight: bold;
            font-size: 12px;
        }
        input[type="image"]{
            position: relative;
            top: 186px;
            left: 130px;
        }
    </style>
</head>
<body>
<b> ${error}</b>
<div class="login">

    <form action="/admin/login" method="post">

        <input type="text" name="userLoginName" value="xiaohei"   placeholder="请输入昵称"/><br>
        <input type="password" name="userPassword"  value="123435"   placeholder="请输入密码"/><br>
        <div class="post">
            <input type="radio" name="userPost" value="1"/>管理员&nbsp;&nbsp;&nbsp;
            <input type="radio" name="userPost" value="0"/>商家
        </div>
        <input type="image" src="static/images/login-botton.PNG"/>
    </form>
</div>
</body>
</html>
