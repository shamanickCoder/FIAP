package br.com.fiap.modelo;

public class Fabricante {
       private String nome;
       private Telefone fone;
       private String email;
       
       public void setNome(String nome2){
    	   nome = nome2;
       }
       public void setFone(Telefone fone2){
    	   fone = fone2;
       }
       public void setEmail(String email2){
    	   email = email2;
       }
       public String getNome(){
    	   return nome;
       }
       public Telefone getFone(){
    	   return fone;
       }
       public String getEmail(){
    	   return email;
       }
       public String getTudo(){
    	   return "Nome: " + nome + "\n" + "Telefone: " + fone.getTudo() + "\n" + "Email: " + email;
       }
}