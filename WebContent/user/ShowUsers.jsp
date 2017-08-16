<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:if test="users.size() > 0">
<title>Show User</title>
<table border="1px" cellpadding="8px">
	<tr>
		<th>Customer Id</th>
		<th>Username</th>
		<th>Email</th>
	</tr>
	<s:iterator value="users">
		<tr>
			<td><s:property value="user_id" /></td>
			<td><s:property value="username" /></td>
			<td><s:property value="email" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
</head>
<body>

</body>
</html>