package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConexaoFactory;

public class TelefoneDAO {
	
	private Connection conexao;
	
	public TelefoneDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void add(Telefone T, int codigoCliente) throws Exception{
		PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO T_LTP_TELEFONE values (?,?,?,?,?)");
		estrutura.setInt(0, T.getNumero());
		estrutura.setShort(1, T.getDdd());
		estrutura.setString(2, T.getOperadora());
		estrutura.setLong(3, T.getCodigo());
		estrutura.setInt(4, codigoCliente);
		estrutura.execute();
		
		System.out.println("Gravado");
		estrutura.close();
	}
}
