<%@ page import="java.util.LinkedList" %>
<%@ page import="entities.Articulo" %>
<%@ page import="data.DataArticulo" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
	    <title>Nueva venta</title>
		 <%
		 	DataArticulo dataArticulo = new DataArticulo();
		  	LinkedList<Articulo> artList = dataArticulo.getAll();
		 %>
	</head>
	
	<body>
		<div id="divListaArticulos">
		  	<h4>Articulos:</h4>
		  	
		  	<% for (Articulo articulo : artList) { %>
		  		<p><%=articulo.toString()%> </p>
			<% } %>

	  	</div>
	</body>
</html>