<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
	<form action="searchlead" method="post">
	search <input type="search" name="id"/>
	<input type="submit" value="search"/>
	</form>
	${msg}
</body>
</html>