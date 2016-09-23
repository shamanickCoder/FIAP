<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Entre</h1>
<% if(request.getAttribute("qualquer") != null){ %>
<p><%= request.getAttribute("qualquer") %></p>
<% } %>
<img src = "images.jpg" alt = "joycefdp" heigth = "420" width = "420"></img>
<form  method = "post" action = "logar">
 <label for = "idUsuario">Usuário</label>
 <input type = "text" name = "usuario" id = "idUsuario">
 <label for = "idSenha">Senha</label>
 <input type = "password" name = "senha" id = "idSenha"> 
 <input type = "submit" value = "Enviar">
</form>
</body>
</html>