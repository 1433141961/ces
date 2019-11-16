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

<form action="/findUserByIdServlet" method="post">
    <table align="center">
        <tr>
            <th>属性</th>
            <th>信息</th>
        </tr>
        <tr>
            <td align="center">查找的id</td>
            <td><input type="text" name="id"></td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="查找">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
