<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
</head>
<body>
	<h1>Bonjour ${user.getUsername()} !</h1>
	<p>Vous pouvez acc�der aux liens suivants :</p>
	<ul>
		<li><a href=/ExoLogin/formation_liste>La liste des formations</a></li>
		<li><a href=#>La liste des �l�ves</a></li>
	</ul>
</body>
</html>