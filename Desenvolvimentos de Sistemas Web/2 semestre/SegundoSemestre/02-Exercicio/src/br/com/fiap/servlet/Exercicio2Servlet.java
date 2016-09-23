package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class Exercicio2Servlet extends HttpServlet{
	
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int numero1 = Integer.parseInt(req.getParameter("num1"));
	  int numero2 = Integer.parseInt(req.getParameter("num2"));
	  System.out.println((numero1 + numero2));
	  //JOptionPane.showMessageDialog(null, (numero1 + numero2));
	  
  }
}
