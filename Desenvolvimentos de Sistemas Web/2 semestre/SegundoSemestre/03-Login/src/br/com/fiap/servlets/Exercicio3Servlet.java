package br.com.fiap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 @WebServlet("/logar") 
  */

public class Exercicio3Servlet extends HttpServlet{
 public void doPost(HttpServletRequest request, 
		 HttpServletResponse response) throws ServletException, IOException{
	 
	 String login = request.getParameter("usuario");
	 String pass = request.getParameter("senha");
	 PrintWriter joyce = response.getWriter();
	 response.setContentType("text/html");
	 
	 if(login.equals("FIAP") && pass.equals("2016")){
		 joyce.println("<html><body>" + "Usuário e senha corretos!" + "</body></html>");
	 }
	 else {
		 joyce.println("<html><body>" + "Usuário e senha incorretos!" + "</body></html>");
	 }
 }
}
