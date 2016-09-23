package br.com.fiap.testes;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> cargos = new HashSet<String>();
        
        cargos.add("DBA");
        cargos.add("Desenvolvedor");
        cargos.add("Estagiário");
        cargos.add("Analista");
        cargos.add("Suporte");
        cargos.add("DBA");
        System.out.println(cargos);
	}

}
