package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/cadastrarUsuario")
public class UsuarioServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeUsuario = req.getParameter("nome");
		String loginUsuario = req.getParameter("usuario");
		String senhaUsuario = req.getParameter("senha");
		String repeatSenhaUsuario = req.getParameter("repeatSenha");

		Usuario usuario = new Usuario(nomeUsuario,loginUsuario,senhaUsuario);
		UsuarioBO usuarioBO = new UsuarioBO();
		try {
			usuarioBO.cadastrar(usuario, repeatSenhaUsuario);
			req.setAttribute("chaveMensagem2", "Cadastrado com sucesso");
			
			req.getRequestDispatcher("login-usuario.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("erro", e.getMessage());
			req.getRequestDispatcher("cadastro-usuario.jsp").forward(req, resp);
		}
        
	}
}
