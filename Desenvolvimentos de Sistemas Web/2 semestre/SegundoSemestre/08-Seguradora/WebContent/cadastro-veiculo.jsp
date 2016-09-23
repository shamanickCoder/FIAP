<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Veículos</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
</head>
<body>
<div class = "row">
 <div class = "col-md-6">
  
 </div>
</div>

<div class = "container">
 <h1>Cadastro de veículos</h1>
 
 <div >
 <% if(request.getAttribute("mensagem") != null){ %>
  <%= request.getAttribute("mensagem") %>
  
  <%} %>
</div>
 <form method = "post" action = "veiculo">
  <div class = "form-group">
  <label for = "idModelo">Modelo</label>
  <input type = "text" id = "idModelo" name = "modelo">
  </div>
  <div class = "form-group">
  <label for = "idValor">Valor</label>
  <input type = "text" id = "idValor" name = "valor">
  </div>
  <div>
  <label for = "idAno">Ano</label>
  <input type = "text" id = "idAno" name = "ano">
  </div>
  <div>
  <label for = "idMontadora">Montadora</label>
  <select name = "montadora" id = "idMontadora">
   <option value = ""></option>
   <option value = "ford">Ford</option>
   <option value = "fiat">Fiat</option>
   <option value = "mercedes">Mercedes</option>
  </select>
  </div>
  <div>
  <input type = "submit" value = "Cadastrar" class = "btn btn-primary">
  <a href = "veiculo">Lista de veículos</a>
  </div>
 </form>
 </div>
</body>
</html>