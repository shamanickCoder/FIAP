package br.com.fiap.testes;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.ConexaoFactory;

public class TesteConexao6 {

	public static void main(String[] args) {
		Connection c = null;
		
		try {
			c = new ConexaoFactory().getConnection(JOptionPane.showInputDialog("Usuário: "),
					JOptionPane.showInputDialog("Senha: "));
			System.out.println("Conexão aberta!");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Erro de conexão.");
		}
		finally{
			try{
				c.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
