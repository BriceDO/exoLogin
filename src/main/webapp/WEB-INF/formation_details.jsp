<%@page import="models.Formation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Voici le détail de la formation sélectionnée</title>

	<% Formation form = (Formation) request.getAttribute("formations"); %>
	<h1>Titre de la formation : <%= form.getTitre() %></h1>
	<p>Programme de la formation :<%= form.getProgramme() %></p>
	<p>Nombre d'élèves : <%= form.getNbEleve() %></p>
</head>
<body>

</body>
</html>