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

<h1 align="center">--节目评分--</h1>
<hr>
<form action="ProC?cmd=update1" method="post">
<table border="1px" cellspacing="0" align="center" width="600px">
	<tr>
		<td>编号</td>
		<td>节目名</td>
		<td>节目类型</td>
		<td>表演者</td>
		<td>报送单位</td>
		<td>打分</td>
	</tr>
	<c:forEach items="${list}" var="map">
	<tr>
		<td><input type="text" name="pro_id" value="${map.pro_id }" readonly="true" ></td>
		<td><input type="text" name="pro_name" value="${map.pro_name }" readonly="true" ></td>
		<td><input type="text" name="pro_type" value="${map.pro_type }" readonly="true" ></td>
		<td><input type="text" name="pro_per" value="${map.pro_per }" readonly="true" ></td>
		<td><input type="text" name="pro_dan" value="${map.pro_dan }" readonly="true" ></td>
		<td><input type="text" name="pro_numplay" value="${map.pro_num }" readonly="true" ></td>
		<%-- <td><c:out value="${map.pro_num }"></c:out></td> --%>
		<c:if test="${map.flag == 0}">
		<td><input id="${map.pro_id }" type="text" name="pro_num"  value="${map.pro_num }"></td>
		<td><a href="" onclick="getkey(this,${map.pro_id })" >打分</a></td>
		<script type="text/javascript">
		    function getkey(a,id) {
		        var pms = 'cmd=update1&pro_id='+id +"&pro_num="+document.getElementById(id).value;
		  	a.href = 'ProC?' + pms;
		  }
		</script>
</c:if>
		<!-- <td><input type="submit" value="提交"></td> -->
		<%-- "&pro_type="+type+"&pro_per="+per+"&pro_dan="+dan+ --%>
		
	</tr> 
</c:forEach>
</table>
</form>
</body>
</html>