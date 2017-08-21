<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Villain</title>
</head>
<link rel="stylesheet" href="css/secret.css" />
<body>

<div id="startOptions">

	<div id="welcome">Secret Villain</div>

	<form action="StartGame" method="post">
	
		<input type="submit" id="submitAmount" value="Submit">
		
		<div id="playerAmountSelect">Number of Players?
		<select name="numOfPlayers">
			<option value="5"selected>5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
		</select>
		</div>
		<div id="nickNames">
			<div class="gameInput">
			<label for="goodName">Harry is good, he is a </label><input type="text" id="goodName" name="goodName" placeholder="No Maj"/>
			</div>
			<div class="gameInput">
			<label for="badName">Ron is bad, he is a </label><input type="text" id="badName" name="badName" placeholder="Wizard"/>
			</div>
			<div class="gameInput">
			<label for="badLeader">The worst is </label><input type="text" id="badLeader" name="badLeader" placeholder="Voldemort"/>
			</div>
		</div>
	</form>
</div>
</body>
</html>