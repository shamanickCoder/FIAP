package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrar")
public class ProdutoServlet extends HttpServlet{
 
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	String codigoProduto = req.getParameter("codigo");
	String nomeProduto = req.getParameter("nome");
	String precoProduto = req.getParameter("preco");
	
	req.setAttribute("chaveCodigo", codigoProduto);
	req.setAttribute("chaveNome", nomeProduto);
	req.setAttribute("chavePreco", precoProduto);
	req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
}
}
