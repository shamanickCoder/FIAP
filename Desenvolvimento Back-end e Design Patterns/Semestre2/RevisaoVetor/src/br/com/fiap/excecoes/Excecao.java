package br.com.fiap.excecoes;

public class Excecao extends Exception{
 public Excecao(String mensagem, Exception e){
	 super(mensagem, e);
	 if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
		 System.out.println("Foi digitado um dado errado.\n" + e);
		 e.getMessage();
		 e.printStackTrace();
	 }
	 else if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")){
		 System.out.println("Estourou o vetor.");
		 e.getMessage();
		 e.printStackTrace();
	 }
 }
}
