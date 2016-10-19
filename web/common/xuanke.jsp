<%--
  Created by IntelliJ IDEA.
  User: lllzx910
  Date: 2016/10/19
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>欢迎您登录选课系统</title>
    <link rel="stylesheet" type="text/css" href="../styles/adminMain.css">
    <link rel="stylesheet" type="text/css" href="../styles/main2.css">
</head>
<body>
<div id="leftbar">
    <img id="logo" src="../images/logo.png">
    <a class="lefts" id="pic1" href="xuanke.jsp">选课</a>
    <a class="lefts" id="pic2" href="tuixuan.jsp">退选</a>
    <a class="lefts" id="pic3" href="chaxun.jsp">查询</a>
    <img id="logo1" src="img/logo1.png">
</div>
<div id="banner">
    <p id="studentName">欢迎您，XX同学</p>
</div>

<div id="titles" class="container">
    <p id="number">序号</p>
    <p id="cName">课程名称</p>
    <p id="teacher">老师</p>
    <p id="cTime">上课时间</p>
    <p id="place">上课地点</p>
    <p id="cridit">学分</p>
    <p id="numbers">当前人数/人数</p>
    <p >操作</p>
</div>

<form action="########" class="container">
    <p id="number">1</p>
    <p id="cName">美国一流大学</p>
    <p id="teacher">王浅</p>
    <p id="cTime">1-10周 9-11节</p>
    <p id="place">东九110</p>
    <p id="cridit">1.5</p>
    <p id="numbers">30/100</p>
    <input id="but" type="submit" value="退选" onclick="alert('退选成功')">
</form>


<script type="text/javascript" src="../scripts/main2.js"></script>
</body>
</html>
