package br.com.fiap.excecoes;

public class Excecoes extends Exception{
	
 public Excecoes(String mensagem, Exception e){
	 super(mensagem, e);
	 this.print();
	 e.printStackTrace();
	 
 }
 public Excecoes(String mensagem){
	 super(mensagem);
 }
 public void print(){
	 System.out.println("---TRATANDO ERRO---");
	 System.out.println(getMessage());
	 System.out.println("Print Stack Strace: ");
 }
}
