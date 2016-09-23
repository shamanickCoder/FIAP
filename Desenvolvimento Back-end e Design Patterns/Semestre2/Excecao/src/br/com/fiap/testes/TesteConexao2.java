package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteConexao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conectar = null;
		PreparedStatement estrutura = null;
		ResultSet resultado = null;

		try{
			conectar = DriverManager.getConnection
					("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
			estrutura = conectar.prepareStatement
					("SELECT nr_cliente, nm_cliente FROM T_LTP_CLIENTE");
			resultado = estrutura.executeQuery();

			while(resultado.next()){
				System.out.println("\nCliente: " + resultado.getString("nm_cliente"));
				System.out.println(" ["+resultado.getString("nr_cliente")+"]");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				resultado.close();
				estrutura.close();
				conectar.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
