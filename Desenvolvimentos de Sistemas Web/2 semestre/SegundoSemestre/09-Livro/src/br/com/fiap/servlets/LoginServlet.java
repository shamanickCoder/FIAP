package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		UsuarioBO bo = new UsuarioBO();
		
		Usuario usuario = bo.logar(login, senha);
		
		if(usuario == null){
			req.setAttribute("mensagemErro", "Informações erradas!");
			req.getRequestDispatcher("login-usuario.jsp").forward(req, resp);			
		}
		else {
			HttpSession session = req.getSession();
			
			session.setAttribute("mensagemSucesso", "Bem vindo " + usuario.getNome());
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}
}
