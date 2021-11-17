<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css"/>
</head>
<body>


	<h1>Veuillez vous authentifier</h1>
	<p>Pour tester l'authentification : nom = brice, mpd = mdp</p>
	<form method="POST" action="login">
	
		<input placeholder="Ton username" type="text" name="name"/><br>		
	
		<input placeholder="Ton mot de passe" type="password" name="mdp"/><br>
		
		<input type="submit" value="Envoyez">			
	
	</form>

	<!-- J'ai pas trouvé comment lier mon fichier CSS... désolé ! -->
 	<style>
		body {
	    font-family: Arial, Helvetica, sans-serif;
	    background: linear-gradient(to right, #c9d6ff, #e2e2e2);
		}

		h1 {
	    text-align: center;
	    font-size: 4vw;
	    margin: 30px 0;
		}
		
		p {
		text-align: center;
		display: display-flex;
		justify-content: center;
		margin: 30px 0;
		}
		
		input{
	    display: block;
	    margin: 10px auto;
	    padding: 20px;
	    font-size: 20px;
	    width: 40%;
		}
	</style>
	
</html>