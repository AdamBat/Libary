<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/books/">
	ID<input type="text" name="id"><br>
ISBN<input type="text" name="isbn"><br>
Title<input type="text" name="title"><br>
Author<input type="text" name="author"><br>
Publisher<input type="text" name="publsher"><br>
Type<input type="text" name="type"><br>
<input type="submit" name="Submit new book">
	</form>
</body>
</html>