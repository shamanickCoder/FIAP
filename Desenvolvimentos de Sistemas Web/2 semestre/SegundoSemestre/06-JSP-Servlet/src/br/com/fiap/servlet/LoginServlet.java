package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//Recuperar as informaçoes da pagina JSP
		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		
		if(usuario.equals("fiap") && senha.equals("1234")){
			req.setAttribute("olalogin", usuario);
			//Redirecionar para a pagina home
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else {
			//Passar informações para a página
			req.setAttribute("qualquer", "Usuário e/ou senha inválidos!");
			//Redirecionar o usuario para a pagina de login
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
