
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
    <title>查找员工</title>
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
    <table align="center">
        <td width="50"><img  src="${image_path}${user.pic }" width="50" height="60"></td>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>
            <c:if test="${user.gender==1}" >
                男
            </c:if>
            <c:if test="${user.gender==0}" >
                女
            </c:if>

        </td>
        <td>${user.birthday}</td>
        <td>${user.address}</td>
        <td>${user.sal}</td>
        <td><a href="/getUserByIdServlet?id=${user.id}"><img src="/tab/images/edt.gif" >编辑</a>
            <a href="/delUserServlet?id=${user.id}"><img src="/tab/images/del.gif" alt="">删除</a>
        </td>

        </tr>
    </table>
</body>
</html>
