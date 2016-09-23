package br.com.fiap.testes;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoDAO {

	public static void main(String[] args) throws Excecao{
		// TODO Auto-generated method stub
        try{
        	Cargo c = new Cargo();
        	c.setCargo("DESENVOLVEDOR");
        	c.setNivel("JUNIOR");
        	c.setSalario(3500);
        	CargoDAO dao = new CargoDAO();
        	dao.gravar(c);
        	System.out.println("Gravado");
        }
        catch(Exception e){
        	throw new Excecao("Houve um problema", e);
        }
	}

}
