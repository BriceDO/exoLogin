<%@page import="java.util.List"%>
<%@page import="models.Formation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste formation</title>
</head>
<body>
	<h1>Voici la liste des formations</h1>
	
	<ul>
	<% for (Formation form : (List<Formation>) request.getAttribute("formations")) {%>
		<li>
			<a href="/ExoLogin/formation_details?titre=<%= form.getTitre() %>"><%= form.getTitre() %></a>
		</li>
	<% }%>		
	</ul>
</body>
</html>