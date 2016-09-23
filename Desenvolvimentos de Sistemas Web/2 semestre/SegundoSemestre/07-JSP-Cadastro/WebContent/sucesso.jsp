<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Çuçeço</title>
</head>
<body>
<h1>Produto cadastrado!!</h1>
<p>Nome: <%= request.getAttribute("chaveNome") %></p>
<p>Código: <%= request.getAttribute("chaveCodigo") %></p>
<p>Preço: <%= request.getAttribute("chavePreco") %></p>
</body>
</html>