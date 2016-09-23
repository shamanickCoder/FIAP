package br.com.fiap.excecoes;

public class Excecao extends Exception{
 public Excecao(String mensagem, Exception e){
	 super(mensagem, e);
	 if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
		 System.out.println("Digitou um valor errado.");
	 }
	 else if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")){
		 System.out.println("Estourou o vetor.");
	 }
	 e.getMessage();
	 e.printStackTrace();
 }
}
