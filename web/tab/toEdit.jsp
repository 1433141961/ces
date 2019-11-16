<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/13
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/tab/tabLibs.jsp"%>
<html>
<head>
    <title>修改数据</title>
    <style>
        table{
            width:800px;
            border-collapse: collapse;
        }
        th,td{

            border: 1px solid #7dbad7;
        }
    </style>
</head>
<body>
<form action="/updatelUserServlet" method="post" enctype="multipart/form-data">
    <input type="hidden" name="id" value="${user.id}">
    <table align="center">
        <tr>
            <th>属性</th>
            <th>信息</th>
        </tr>
        <tr>
            <td align="center">用户名</td>
            <td><input type="text" name="username" value="${user.username}"></td>
        </tr>
        <tr >
            <td align="center">密码</td>
            <td><input type="password" name="password" value="${user.password}"></td>
        </tr>
        <tr>
            <td align="center">性别</td>
            <td><input type="radio" name="gender" value="1"
                      <c:if test="${user.gender==1}"> checked </c:if>>男

                <input type="radio" name="gender" value="0"  <c:if test="${user.gender==0}"> checked </c:if>>女

            </td>
        </tr>
        <tr>
            <td align="center">头像</td>
            <td><input type="file" name="pic" value="${image_path}${user.pic}"></td>
        </tr>
        <tr>
            <td align="center">生日</td>
            <td><input type="text" name="birthday" value="${user.birthday}" ></td>
        </tr>
        <tr>
            <td align="center">地址</td>
            <td><input type="text" name="address" value="${user.address}" ></td>
        </tr>
        <tr>
            <td align="center">薪水</td>
            <td><input type="text" name="sal" value="${user.sal}"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
