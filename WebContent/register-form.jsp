<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/UserC?cmd=register" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="user_name"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="user_password"></td>
			</tr>
			<tr>
				<td>类型</td>
				<td>
					<input type="radio" name="user_type" value="管理员">管理员
					<input type="radio" name="user_type" value="普通用户">普通用户
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>
</body>
</html>