package br.com.fiap.excecoes;

public class Excecao extends Exception {
 public Excecao(String mensagem, Exception e){
	 super(mensagem, e);
	 System.out.println("Foi encontrada uma exceção.");
	 e.getMessage();
	 e.printStackTrace();
 }
 public Excecao(String mensagem){
	 super(mensagem);
	 System.out.println("Foi encontrada uma exceção.");
 }
}
