<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h1 align="center">--节目信息管理--</h1>
<hr>

<table border="1px" cellspacing="0" align="center" width="600px">
	<tr>
		<td>编号</td>
		<td>节目名</td>
		<td>节目类型</td>
		<td>表演者</td>
		<td>报送单位</td>
		<td>票数<a href="pro-insert.jsp">添加</a></td>
	</tr>
	 <c:forEach var="pro" items="${list}">
     <tr  height="30px">
     <td>${pro.pro_id}</td>
     <td>${pro.pro_name}</td>
     <td>${pro.pro_type}</td>
     <td>${pro.pro_per}</td>
     <td>${pro.pro_dan}</td>
     <td>${pro.pro_num}</td>
     <td>
			
			<a href="ProC?cmd=delete&pro_id=${pro.pro_id}" >删除</a>
			<a href="pro-update.jsp?pro_id=${pro.pro_id}&pro_name=${pro.pro_name}&pro_type=${pro.pro_type}&pro_per=${pro.pro_per}&pro_dan=${pro.pro_dan}&pro_num=${pro.pro_num}">修改</a>
		</td>
	</c:forEach>
     <%-- <td><a href="update.jsp?name=${student.name}&phone=${student.phone}&school=${student.school}" >修改</a></td>
     <td><a href="${pageContext.request.contextPath }/DeletServlet?id=${student.id}" >删除</a></td>   --%>
     <!-- </tr> -->
<%-- 	<c:forEach items="${pros}" var="map">
	<tr>
		<td><c:out value="${map.value.pro_id }"></c:out></td>
		<td><c:out value="${map.value.pro_name }"></c:out></td>
		<td><c:out value="${map.value.pro_type }"></c:out></td>
		<td><c:out value="${map.value.pro_per }"></c:out></td>
		<td><c:out value="${map.value.pro_dan }"></c:out></td>
		<td><c:out value="${map.value.pro_num }"></c:out></td>
		<td>
			
			<a href="ProServlet?cmd=deletePro&pro_id=${pro.pro_id}" >删除</a>
			<a href="ProServlet?cmd=getProUpdate&pro_id=${pro.pro_id}">修改</a>
		</td>

		<td>
			<a href="ProServlet?cmd=deletePro&pro_id=${map.value.pro_id}" >删除</a>
			<a href="ProServlet?cmd=getProUpdate&pro_id=${map.value.pro_id}">修改</a>
		</td>
	</tr>
	<p><c:set var="pro_id" value="${map.value.pro_id }" scope="session"></c:set></p>
	<p><c:set var="pro_name" value="${map.value.pro_name }" scope="session"></c:set></p>
	<p><c:set var="pro_type" value="${map.value.pro_type }" scope="session"></c:set></p>
	<p><c:set var="pro_per" value="${map.value.pro_per }" scope="session"></c:set></p>
	<p><c:set var="pro_dan" value="${map.value.pro_dan }" scope="session"></c:set></p>
	<p><c:set var="pro_dan" value="${map.value.pro_dan }" scope="session"></c:set></p>
	<p><c:set var="pro_num" value="${map.value.pro_num }" scope="session"></c:set></p>
</c:forEach> --%>
</table>
</body>
</html>