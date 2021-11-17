<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Login</title>
</head>
<body>


	<h1>Veuillez vous authentifier</h1>
	<p>Pour tester l'authentification : nom = brice, mpd = mdp</p>
	<form method="POST" action="login">

		Entrez votre username 		
		<input type="text" name="name"/><br>		
	
		Entrez votre mot de passe
		<input type="password" name="mdp"/><br>
		
		<input type="submit" value="submit">			
	
	</form>
	
	<%  %>
	<p>
	
</html>