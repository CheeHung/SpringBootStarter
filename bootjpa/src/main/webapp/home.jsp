<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Alien</h2>
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="Submit"><br>
	</form>
	
	<h2>Get Alien by ID</h2>
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="Submit"><br>
	</form>
	
	<h2>Get Alien by tech</h2>
	<form action="getAlienByTech">
		<input type="text" name="tech"><br>
		<input type="Submit"><br>
	</form>
	

</body>
</html>