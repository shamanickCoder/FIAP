package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TesteConexao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conectar = null;
		PreparedStatement estrutura = null;
		ResultSet resultado = null;

		try{
			String nome = JOptionPane.showInputDialog("Digite o nome para pesquisar: ");
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para pesquisar: "));


			conectar = DriverManager.getConnection
					("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
			estrutura = conectar.prepareStatement("SELECT nr_cliente, nm_cliente " + "FROM T_LTP_CLIENTE WHERE nr_cliente = ?"+" AND nm_cliente = ?");
			estrutura.setInt(1, numero);
			estrutura.setString(2, nome);

			resultado = estrutura.executeQuery();

			while(resultado.next()){
				System.out.println("\nCliente: " + resultado.getString("nm_cliente"));
				System.out.println(" [" + resultado.getString("nr_cliente")+"]");
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
