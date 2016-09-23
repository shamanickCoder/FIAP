<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel = "stylesheet" text = "text/css" href = "css/bootstrap.min.css">
<title>Cadastro</title>
</head>
<body>
<%@ include file= "navbar.jsp" %>
 <div class = "container">
  <h1>Cadastro de livro</h1>
  
  <% if(request.getAttribute("chaveMensagem") != null) {%>
  <%= request.getAttribute("chaveMensagem") %>
  <% } %>
  <%-- ${chaveMensagem} --%>
  <br>
  <a href = "lista-livro.jsp">Lista de livros cadastrados</a>
  <div class = "row">
   <div class = "col-md-4">
    <form method = "post" action = "cadastrar">
     <div class = "form-group">
      <label for = "idISBN">ISBN</label>
     <input type = "text" name = "isbn" id = "idISBN" class = "form-control">
     <label for = "idTitulo">Título</label>
     <input type = "text" name = "titulo" id = "idTitulo" class = "form-control">
     <label for = "idNumPag">Número de páginas</label>
     <input type = "text" name = "numPag" id = "idNumPag" class = "form-control">
     <label for = "idAutor">Autor</label>
     <input type = "text" name = "autor" id = "idAutor" class = "form-control">
     <input type = "submit" value = "Cadastrar" class = "form-control">
     </div>
    </form>
    
   </div>
  </div>
 </div>
</body>
</html>