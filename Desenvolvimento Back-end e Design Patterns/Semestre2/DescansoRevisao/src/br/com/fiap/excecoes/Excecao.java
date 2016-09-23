package br.com.fiap.excecoes;

public class Excecao extends Exception{
	public Excecao(Exception e){
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")){
			System.out.println("Estouro");
		}else{
			System.out.println("Desconhecido");
		}
	}
}
