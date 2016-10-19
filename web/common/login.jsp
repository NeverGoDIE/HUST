<%--
  Created by IntelliJ IDEA.
  User: lllzx910
  Date: 2016/10/19
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>公告管理系统</title>
    <link rel="stylesheet" type="text/css" href="../styles/main1.css">
</head>

<body>
<div id="container">
    <div id="welcome">
        <p>学生选课系统</p>
    </div>
    <div id="loginFormContainer">
        <div id="loginForm">
            <form action="Login" method="get">
                <div class="forms">
                    <span> 账号</span>
                    <input id="userName" name = "userID" class="text" type="text">
                </div>
                <div class="froms">
                    <span>密码</span>
                    <input id="userPassword"  name = "userPasswd" class="text" type="password">
                </div>
                <div class="forms">
                    <input class="btn" id="btnLogin" type="submit" value="确定">
                    <input class="btn" id="btnRegister" value="注册">
                </div>
            </form>
        </div>
    </div>
    <div id="copyright">
        <p>版权所有，仿冒必究。</p>
        <p>联系我们：</p>
    </div>
</div>


<div id="registerForm">

    <label for="newUserID">账号 </label>
    <input id="newUserID" name = "userID" class="texts" type="text">
    <img id="newUserIDpic">

    <label for="newUserName">姓名</label>
    <input id="newUserName" name = "name" class="texts" type="text">
    <img id="newUserNamepic" >

    <label for="newUserType">类型</label>
    <input id="newUseType" name = "type" class="texts" type="text">
    <img id="newUserNamepic" >

    <label for="newMajorClass">班级</label>
    <input id="newMajorClass" name = "majorClass" class="texts" type="text">
    <img id="newUserNamepic" >

    <label for="newDepartment">院系</label>
    <input id="newDepartment" name = "department" class="texts" type="text">
    <img id="newUserNamepic" >

    <label for="newUserPassword">密码</label>
    <input id="newUserPassword" name = "password" class="texts" type="password">
    <img id="newUserPasswordpic">

    <label for="newUserPasswords">确认密码</label>
    <input id="newUserPasswords" class="texts" type="password">
    <img id="newUserPasswordspic">


    <p id="alert"> </p>
    <div id="rebtn">
        <input class="btns" id="btnRegisters" type="submit" value="注册">
        <input class="btns" id="btnCancel" type="submit" value="取消">
    </div>
</div>
<script type="text/javascript" src="../scripts/main1.js"></script>
</body>

</html>