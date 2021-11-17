<%@page import="java.util.List"%>
<%@page import="models.Eleve"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Eleves</title>
</head>
<body>
	<h1>Liste des élèves</h1>
	
	<ul>
	<% for (Eleve el : (List<Eleve>) request.getAttribute("eleves")) {%>
		<li>
			<a href="/ExoLogin/eleve_details?nom=<%= el.getNom() %>"><%= el.getNom()%> <%=el.getPrenom() %></a>
		</li>
	<% }%>		
	</ul>
</body>
</html>