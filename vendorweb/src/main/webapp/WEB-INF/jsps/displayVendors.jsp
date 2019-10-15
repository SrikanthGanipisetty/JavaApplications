<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Vendors:</h2>
<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
<th>email</th>
<th>phone</th>
<th>address</th>
</tr>

<c:forEach items="${vendors}" var="vendor">
<tr>
<td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.type}</td>
<td>${vendor.email}</td>
<td>${vendor.phone}</td>
<td>${vendor.address}</td>
<td><a href="deleteVendor?id=${vendor.id}">delete</a></td>
<td><a href="showUpdate?id=${vendor.id}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Vendor</a>
</body>
</html>