package br.com.fiap.bo;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAOList;
import br.com.fiap.excecoes.Excecao;

public class CargoBOList {
	CargoDAOList dao = new CargoDAOList();

	public void incluir(String pCargo, String pNivel, double dblSalario) throws Excecao{
		if(pCargo.length() < 2){
			throw new Excecao("Caracteres insuficientes no Cargo.");
		}
		if(dblSalario < 700){
			throw new Excecao("Salário não pode ser menor que 700.");
		}
		Cargo objCargo = new Cargo(pCargo.toUpperCase(), pNivel.toUpperCase(), dblSalario);
		System.out.println(dao.gravar(objCargo));
	}
	public void exibir(){
		System.out.println(dao.exibir());
	}
	public void pesquisar(){
		String pesquisa = JOptionPane.showInputDialog("Digite o cargo para pesquisar: ").toUpperCase();
		dao.pesquisar(pesquisa);
	}
	public void apagar(String pCargo){
		//pCargo = JOptionPane.showInputDialog("Digite o cargo para deletar: ");
      dao.deletar(pCargo);
	}
}
