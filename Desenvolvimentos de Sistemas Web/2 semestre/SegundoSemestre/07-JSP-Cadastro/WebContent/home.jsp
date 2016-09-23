<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Cadastro de produto</h1>
<form method = "post" action = "cadastrar">
 <label for = "idCodigo">Código: </label>
 <input type = "text" name = "codigo" id = "idCodigo">
 <label for = "idNome">Nome: </label>
 <input type = "text" name = "nome" id = "idNome">
 <label for = "idPreco">Preço: </label>
 <input type = "text" name = "preco" id = "idPreco">
 <input type = "submit" value = "Salvar">
</form>
</body>
</html>