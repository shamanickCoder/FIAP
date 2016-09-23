package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoDAO2 {

	public static void main(String[] args) throws Excecao{
		// TODO Auto-generated method stub
        try {
        	CargoDAO dao = new CargoDAO();
        	List<Cargo> lista = dao.getLista();
        	for(Cargo obj: lista){
        		System.out.println(obj.getCargo() + "\n" + obj.getNivel() + "\n" + obj.getSalario());
        	}
        }
        catch(Exception e){
        	throw new Excecao("Engano", e);
        }
	}

}
