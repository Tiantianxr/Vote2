<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String pro_id = request.getParameter("pro_id");
	System.out.println("id"+pro_id);
	String pro_name = request.getParameter("pro_name");
	String pro_type = request.getParameter("pro_type");
	String pro_per = request.getParameter("pro_per");
	String pro_dan = request.getParameter("pro_dan");
	String pro_num = request.getParameter("pro_num"); 
%> 
<form action="ProC?cmd=update" method="post">
	<table>
		<tr>
			<td>编号</td>
			<td><input type="text" name="pro_id" value=<%=pro_id %> ></td>
		</tr>
		 <tr>
			<td>节目名</td>
			<td><input type="text" name="pro_name" value=<%=pro_name %> ></td>
		</tr>
		<tr>
			<td>节目类型</td>
			<td><input type="text" name="pro_type" value=<%=pro_type %> ></td>
		</tr>
		<tr>
			<td>表演者</td>
			<td><input type="text" name="pro_per" value=<%=pro_per %>></td>
		</tr>
		<tr>
			<td>报送单位</td>
			<td><input type="text" name="pro_dan" value=<%=pro_dan %> ></td>
		</tr>
		<tr>
			<td>票数</td>
			<td><input type="text" name="pro_num" value=<%=pro_num %> ></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="修改"></td>
		</tr> 
	</table>

</form>
</body>
</html>