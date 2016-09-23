package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.bo.VeiculoBO;

@WebServlet("/veiculo")
public class VeiculoServlet extends HttpServlet{
  
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String model = req.getParameter("modelo");
	double val = Double.parseDouble(req.getParameter("valor"));
	String mont = req.getParameter("montadora");
	int ano = Integer.parseInt(req.getParameter("ano"));
	
	//cadastrar veiculo no banco de dados
	Veiculo veiculo = new Veiculo(0, model, val, mont, ano);
	VeiculoBO bo = new VeiculoBO();
	bo.cadastrar(veiculo);
	
	//Retorna para a página de cadasro com uma
	//Mensagem de sucesso
	//Mensagem que será exibida na página JSP
	req.setAttribute("mensagem", "Cadastrado com sucesso");
	//Redirecionar para a página de cadastro
	req.getRequestDispatcher("cadastro-veiculo.jsp").forward(req, resp);
 }
 
 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//buscar os veiculos cadastrados no banco de dados
		VeiculoBO bo = new VeiculoBO();
		List<Veiculo> lista = bo.listar();
		
		//passa a lista para a JSP
		req.setAttribute("chaveLista", lista);
		
		//redirecionar para a pag JSP
		req.getRequestDispatcher("lista-veiculo.jsp").forward(req, resp);
	}
}
