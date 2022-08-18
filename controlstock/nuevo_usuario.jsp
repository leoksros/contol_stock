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
	    <title>Nueva persona</title>
		 <%
		 	DataRole dataRole = new DataRole();
		  	LinkedList<Role> rolesList = dataRole.getAll();
		 %>
	</head>
	
	<body>
		<div id="divNuevaPersona">
		  	<h4>Nuevo usuario:</h4>
			<form action="crear_usuario" method="POST">
			  <div>
			    <label for="nombre"> Nombre </label>
			    <input name="nombre" id="nombre" value="">
			  </div>
			  <div>
			    <label for="apellido"> Apellido </label>
			    <input name="apellido" id="apellido" value="">
			  </div>
			  <div>
			    <label for="email"> E-Mail </label>
			    <input name="email" id="email" value="">
			  </div>
			  <div>
			    <label for="usuario"> Usuario</label>
			    <input name="usuario" id="usuario" value="">
			  </div>	  
			  <div>
			    <label for="password"> Password</label>
			    <input name="password" id="password" value="">
			  </div>
			  <div>
			    <label for="role"> Rol</label>
			    <select name="role" id="role">
			    
			    <% for (Role role : rolesList) { %>
					  <option id="<%=role.getId()%>" value="<%=role.getId()%>"><%=role.getDesc()%></option>
				<% } %>
				</select>
				
			  </div>	  
			  <div>
			    <button>CREAR</button>
			  </div>
			</form>
	  </div>
	</body>
</html>