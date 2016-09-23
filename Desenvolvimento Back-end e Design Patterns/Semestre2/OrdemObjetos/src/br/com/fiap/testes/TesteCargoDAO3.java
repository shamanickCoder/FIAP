package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoDAO3 {

	public static void main(String[] args) throws Excecao{
		// TODO Auto-generated method stub
		try{
			
			CargoDAO dao = new CargoDAO();
			List<Cargo> c = new ArrayList<Cargo>();
			c = dao.consultar(JOptionPane.showInputDialog("Digite o cargo para pesquisar: "));
			
			for(Cargo obj: c){
				System.out.println(obj.getTudo());
			}
			
		}
		catch(Exception e){
			throw new Excecao("aaa", e);
		}
		
		
		
	}

}
