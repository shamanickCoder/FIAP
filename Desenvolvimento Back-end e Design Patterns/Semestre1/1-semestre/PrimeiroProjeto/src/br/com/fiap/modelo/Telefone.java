package br.com.fiap.modelo;

public class Telefone {
     private String operadora;
     private String numero;
     private String ddd;
     
     public void setOperadora(String op){
    	 operadora = op;
     }
     public void setNumero(String nu){
    	 numero = nu;
     }
     public void setDDD(String dd){
    	 ddd = dd;
     }
     public String getOperadora(){
    	 return operadora;
     }
     public String getNumero(){
    	 return numero;
     }
     public String getDDD(){
    	 return ddd;
     }
     public String getTudo(){
    	 return "Operadora: " + operadora + "\n" + "Número: " + numero + "\n" + "DDD: " + ddd;
     }
}