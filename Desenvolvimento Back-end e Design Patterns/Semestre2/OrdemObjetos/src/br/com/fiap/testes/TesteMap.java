package br.com.fiap.testes;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cargo cargo1 = new Cargo("Estagiário", "Pleno", 2500);
        Cargo cargo2 = new Cargo("Estagiário", "Junior", 2000);
        Map<String, Cargo> mapaCargos = new HashMap<String, Cargo>();
        
        //adicionando
        mapaCargos.put("1", cargo1);
        mapaCargos.put("2", cargo2);
        
        //retornando um objeto através da chave
        Cargo objCargo = mapaCargos.get("1");
        System.out.println(objCargo.getCargo());
        
        //exibindo as chaves
        System.out.println(mapaCargos.keySet());
        
        //exibindo os valores dos objetos
        for(Cargo c: mapaCargos.values()){
        	System.out.println(c.getTudo());
        }
	}

}
