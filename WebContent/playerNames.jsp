<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Info</title>
</head>
<link rel="stylesheet" href="css/secret.css" />
<%@ page import="Controller.*" %>
<%@ page import="Model.*" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% Game game = (Game)session.getAttribute("game"); 
%>
<body>
	<div id="enterNames">
	<form action="NameOrganizer" method="post">
		<input type="submit" value="Submit" id="submitNamesEntered"><br>
		<c:forEach var="i" begin="0" end="${game.getNumOfPlayers()-1}">
		
			<c:out value="${i+1}"></c:out>.		<input name="fname${i}" class="nameinputBox" type="text" placeholder="First Name">
			<br>
			<br>
		
		</c:forEach>
	</form>
	</div>
</body>
</html>