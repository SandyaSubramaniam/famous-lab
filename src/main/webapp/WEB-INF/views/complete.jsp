<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Famous Lab - Complete List</title>
</head>
<body>
<div class="container">
		<h1 align="center">Complete List</h1>
		<table class="table">
			
				<c:forEach var="comp" items="${complete}">
					<tr>
						<td>${comp.firstName}</td>
						<td>${comp.lastName}</td>
						<td>${comp.innovation}</td>
						<td>${comp.year}</td>
					</tr>
				</c:forEach>
			
		</table>
		<a href="/" class="btn btn-success">Tinyint List</a>
	</div>
</body>
</html>