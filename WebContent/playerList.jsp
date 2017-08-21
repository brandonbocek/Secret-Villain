<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Game</title>
</head>

<link rel="stylesheet" href="css/secret.css" />
<%@ page import="Controller.*" %>
<%@ page import="Model.Game" %>
<%@ page import="Model.Player" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% Game game = (Game)session.getAttribute("game");  
%>

<body>
<div id=roundDisplay>
	This is round: <c:out value="${game.getRoundNum()}"></c:out>
</div>
<form action="Continue" method="POST">
	<input type="submit" value="New Game" id="goBack"/>
	</form>
	<form action="index.jsp">
	<input type="submit" value="New Players" id="goBack"/>
	</form>
<!-- show the word for now -->
<div id="nameTitle">
	<div id="clickSuggest">
	Click on your name
	</div>
	<div id="clickWarn">
	<b>Do NOT click on anyone else's name</b>
	</div>
</div>
<br>
<div id="nameButtons">
	<c:forEach var="i" begin="0" end="${game.getNumOfPlayers()-1}">
		<form name="Reveal" action="Revealer" method="POST">
			<input type="hidden" name="selection" value="full"/>
			<input type="submit" name="playerName" value="${game.getPlayer(i).getName()}" class="${game.getPlayer(i).getAlreadyClicked()}"/>
		</form>
		<div id="peekButton">
		<form name="Reveal" action="Revealer" method="POST">
			<input type="hidden" name="selection" value="partial"/>
			<input type="hidden" name="playerName" value="${game.getPlayer(i).getName()}"/>
			<input type="submit" value="Check ID" class="${game.getPlayer(i).getPeekClicked()}"/>
		</form>
		</div>
			<br>
			<br>
	</c:forEach>
	
	
	
</div>
</body>
</html>