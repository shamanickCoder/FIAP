<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
<title>Lista de livros</title>
</head>
<body>
  <%@ include file = "navbar.jsp" %>
  <div class = "container">
  <table>
   <tr>
    <th>ISBN</td>
    <th>Título</td>
    <th>Número de páginas</td>
    <th>Autor</td>
   </tr>
   <c:forEach var = "itensLista" items = "${chaveLista}">
   <tr>
    <td>${itensLista.isbn}</td>
    <td>${itensLista.titulo}</td>
    <td>${itensLista.numPag}</td>
    <td>${itensLista.autor }</td>
   </tr>
   </c:forEach>
  </table>
  </div>
</body>
</html>