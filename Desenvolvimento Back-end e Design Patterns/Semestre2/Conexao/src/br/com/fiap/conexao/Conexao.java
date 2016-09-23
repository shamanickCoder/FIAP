package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException{
		
		
		
		Connection conexao = null;
		String url = "jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL";
		conexao = DriverManager.getConnection(url);
		System.out.println("Abriu conexão");
		conexao.close();

	}

}
