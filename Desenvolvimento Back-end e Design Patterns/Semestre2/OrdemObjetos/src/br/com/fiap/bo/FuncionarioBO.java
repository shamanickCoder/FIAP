package br.com.fiap.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.dao.FuncionarioDAO;

public abstract class FuncionarioBO {

	public static void gravar(Connection c, Funcionario f) throws Exception {
		new FuncionarioDAO().add(c, f);
	}
	
	public static List<Funcionario> exibirTudo(Connection c) throws Exception {
		return new FuncionarioDAO().getAll(c);
	}
}
