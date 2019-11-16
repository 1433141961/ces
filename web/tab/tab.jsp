<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/tab/tabLibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
    div a{
        text-decoration:none;
    }

    .table_out{
        width: 100%;
        border-collapse: collapse;
    }

    th,td{
        border: 1px solid;
    }

</style>

</head>
<body>
<div>
    <h3 style="color: red;">单前在线人数： ${count}</h3>
</div>
<div style="background-color: #7dbad7;font-weight: 600">
    <a href="/tab/toAdd.jsp">添加</a>
    <a style="margin-left: 10px;" href="/tab/toFind.jsp">查找员工</a>
</div>
<table class="table_out">
    <tr style="background-color: #6cd0ff">
        <th>头像</th>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>生日</th>
        <th>地址</th>
        <th>薪水</th>
        <th>操作</th>
    </tr>
    <%-- <%
         for (CE_USER user:ce_usersList){
     %>--%>
    <c:forEach var="user" items="${userList}">
    <tr>
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
            <a href="/delUserServlet?id=${user.id}"><img src="/tab/images/del.gif">删除</a>
        </td>

    </tr>
    </c:forEach>
</table>
</body>
</html>