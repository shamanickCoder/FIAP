<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP</title>
</head>
<body>

<h1>Index</h1>
<%-- Incluir um arquivo jsp (diretivas) --%>
<%@ include file = "topo.jsp" %>


 <h2>Introdução ao JSP</h2>

 <!-- COMENTARIO HTML (aparece no html final)-->
 <%-- COMENTArIO JSP (nao aparece no html final) --%>
 <ul>
  <% for(int i = 0; i < 10; i++){%>
     <li> <%= i %> </li>
   <%}   
   %>
 </ul>
 <%@ include file = "rodape.jsp" %>
</body>
</html>