<%@ page import="java.util.LinkedList" %>
<%@ page import="entities.Role" %>
<%@ page import="data.DataRole" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
	    <title>Nuevo rol</title>
	</head>
	
	<body>
		<div id="divNuevoRol">
		  	<h4>Nuevo rol:</h4>
			<form action="nuevo_rol" method="POST">
			  <div>
			    <label for="desc"> Descripcion </label>
			    <input name="desc" id="desc" value="">
			  </div>
			  
			  <div>
			    <button>CREAR</button>
			  </div>
			</form>
	  </div>
	</body>
</html>