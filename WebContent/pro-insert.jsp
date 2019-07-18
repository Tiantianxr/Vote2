<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%request.setCharacterEncoding("UTF-8"); %>
<body>
<form action="ProC?cmd=add" method="post">
	<table>
		<tr>
			<td>编号</td>
			<td><input type="text" name="pro_id" value="${pro.pro_id }" ></td>
		</tr>
		<tr>
			<td>节目名</td>
			<td><input type="text" name="pro_name" value="${pro.pro_name }" ></td>
		</tr>
		<tr>
			<td>节目类型</td>
			<td><input type="text" name="pro_type" value="${pro.pro_type }" ></td>
		</tr>
		<tr>
			<td>表演者</td>
			<td><input type="text" name="pro_per" value="${pro.pro_per }" ></td>
		</tr>
		<tr>
			<td>报送单位</td>
			<td><input type="text" name="pro_dan" value="${pro.pro_dan }" ></td>
		</tr>
		<tr>
			<td>票数</td>
			<td><input type="text" name="pro_num" value="0" ></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="添加"></td>
		</tr>
	</table>

</form>
</body>
</html>