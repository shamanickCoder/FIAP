package br.com.fiap.modelo;

public class Aluno {
     private String nome;
     private String rm;
     private String fone;
     
     public Aluno(String no1, String rm1, String fo1){
    	 nome = no1;
    	 rm = rm1;
    	 fone = fo1;
     }
     public Aluno (){
    	 
     }
     public void setNome(String nome2) {
    	 nome = nome2;
     }
     public void setRM(String rm2){
    	 rm = rm2;
     }
     public void setFone(String fone2){
    	 fone = fone2;
     }
     public String getNome(){
    	 return nome;
     }
     public String getRM(){
    	 return rm;
     }
     public String getFone(){
    	 return fone;
     }
}
