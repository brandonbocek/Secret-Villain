<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reveal</title>
</head>

<link rel="stylesheet" href="css/secret.css" />
<%@ page import="Controller.*" %>
<%@ page import="Model.Game" %>
<%@ page import="Model.Player" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% Game game = (Game)session.getAttribute("game"); 
Player player = (Player)session.getAttribute("player");
String selection = (String)session.getAttribute("selection");
%>

<body>

<div id="message">
<c:if test="${selection.equals('full')}">
		<c:if test="${player.getAssignment().equals(game.getGoodName())}">
			<c:out value="${player.getName()}"/>, you are a <c:out value="${player.getAssignment()}"/>
		</c:if>	
		
		<c:if test="${player.getAssignment().equals(game.getBadLeader())}">
			<c:out value="${player.getName()}"/>, you are <c:out value="${player.getAssignment()}"/>
		</c:if>	
		
		<c:if test="${player.getAssignment().equals(game.getBadName())}">
		
			<c:out value="${player.getName()}"/>, you are a <c:out value="${player.getAssignment()}"/><br>
			
			<c:forEach var="i" begin="0" end="${game.getNumOfPlayers()-1}">
				<c:if test="${game.getPlayer(i).getAssignment().equals(game.getBadName()) && !game.getPlayer(i).equals(player)}">
					<c:out value="${game.getPlayer(i).getName()}"/> is also a <c:out value="${game.getPlayer(i).getAssignment()}"/><br>
				</c:if>
				<c:if test="${game.getPlayer(i).getAssignment().equals(game.getBadLeader())}">
					<c:out value="${game.getPlayer(i).getName()}"/> is <c:out value="${game.getPlayer(i).getAssignment()}"/><br>
				</c:if>
			</c:forEach>	
			
		</c:if>	
</c:if>

<c:if test="${selection.equals('partial')}">
	<c:out value="${player.getName()}"/> is a <c:out value="${player.getParty()}"/>
</c:if>
</div>	
	
	
	
<form action="playerList.jsp">
	<input type="submit" value="Back" class="danger" id="goBack"/>
</form>
	
	
</body>
</html>