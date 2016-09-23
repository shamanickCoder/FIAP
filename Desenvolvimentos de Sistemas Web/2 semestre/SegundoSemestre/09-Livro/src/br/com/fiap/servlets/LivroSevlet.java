package br.com.fiap.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Livro;
import br.com.fiap.bo.LivroBO;

@WebServlet("/cadastrar")
public class LivroSevlet extends HttpServlet{

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	long isbn = Long.parseLong(req.getParameter("isbn"));
	String titulo = req.getParameter("titulo");
	int numPag = Integer.parseInt(req.getParameter("numPag"));
	String autor = req.getParameter("autor");
	
	/*req.setAttribute("chaveISBN", isbn);
	req.setAttribute("chaveTitulo", titulo);
	req.setAttribute("chaveNumPag", numPag);
	req.setAttribute("chaveAutor", autor);*/
	
	Livro objLivro = new Livro(isbn, titulo, numPag, autor);
	LivroBO objLivroBO = new LivroBO();
	objLivroBO.cadastrar(objLivro);
	req.setAttribute("chaveMensagem", "Cadastrado com sucesso!");
	
	req.getRequestDispatcher("cadastro-livro.jsp").forward(req, resp);
}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LivroBO objLivro = new LivroBO();
		List<Livro> listaLivros = new ArrayList<Livro>();
		listaLivros = objLivro.listar();
		req.setAttribute("chaveLista", listaLivros);
		req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
		
	}
}
