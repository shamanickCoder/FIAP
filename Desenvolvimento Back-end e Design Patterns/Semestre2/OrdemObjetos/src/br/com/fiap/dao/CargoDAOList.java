package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.excecoes.Excecao;

public class CargoDAOList {
	private List<Cargo> listaCargos = new ArrayList<Cargo>();

	public String gravar(Cargo c) throws Excecao{
		listaCargos.add(c);
		return "Gravado com sucesso";
	}
	public String gravar(String pCargo, String pNivel, double pSalario) throws Excecao{
		listaCargos.add(new Cargo(pCargo,pNivel,pSalario));
		return "Gravado com sucesso";
	}
	public String exibir(){
		String strSaida = "";
		for(Cargo c: listaCargos){
			strSaida += c.getCargo() + " - Salário: " + c.getSalario() + "\n";
		}
		return strSaida;
	}
	public void pesquisar(String pCargo){ //mostra se achar um cargo ja gravado
		for(Cargo c: listaCargos)
			if(c.getCargo().equals(pCargo)){
				System.out.println("\nSalário: "+c.getSalario()+"\nNível: "+c.getNivel());
			}
	}
	public void deletar(String pCargo){
     for(Cargo c: listaCargos){
    	 if(c.getCargo().toUpperCase().equals(pCargo)){
    		 listaCargos.remove(c);
    		 System.out.println(exibir());
    	 }
     }
	}
}
