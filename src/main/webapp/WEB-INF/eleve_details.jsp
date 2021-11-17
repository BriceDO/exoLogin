<%@page import="models.Eleve"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Eleve</title>
</head>
<body>
	<h1>Le détail d'un élève</h1>
	
	<% Eleve el = (Eleve) request.getAttribute("eleves"); %>
	<p>Son nom : <%= el.getNom() %></p>
	<p>Son prénom :<%= el.getNom() %></p>
	<p>Son âge : <%= el.getAge() %></p>
	<p>Sa note : <%= el.getNote() %></p>
	<p>Sa formation : <%= el.getFormation().getTitre() %></p>
</body>
</html>