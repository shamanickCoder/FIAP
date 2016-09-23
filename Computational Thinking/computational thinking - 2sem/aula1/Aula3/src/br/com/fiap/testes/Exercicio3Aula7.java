package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio3Aula7 {

	public static void main(String[] args) {
     String nomeLoja[] = new String[8];
     String nomeProduto[] = new String[4];
     double lojaProduto[][] = new double [8][4];
     int i = 0, j = 0;
     Scanner entrada = new Scanner(System.in);
     
     for(i = 0; i < 3; i++){
    	 System.out.println("Digite o nome da loja: ");
    	 nomeLoja[i] = entrada.next();
     }
    	 for(j = 0; j < 3; j++){
    		 System.out.println("Digite o nome do produto: ");
    		 nomeProduto[j] = entrada.next();
    	 }
     for(i = 0; i < 3; i++){
    	 for(j = 0; j < 3; j++){
    		 System.out.println("Informe o preço do produto " + nomeProduto[i] + " na loja " + nomeLoja[j] + ": ");
    		 lojaProduto[i][j] = entrada.nextDouble();
    	 }
     }
     System.out.println("--- PRODUTOS QUE CUSTAM MENOS DE 120 ---");
     System.out.println("-----------------------------------------");
     for(i = 0; i < 3; i++){
    	 System.out.println("Produto " + nomeProduto[i]);
    	 for(j= 0; j < 3; j++){
    		 if(lojaProduto[i][j] < 120) System.out.println("Loja " + nomeLoja[j] + "- Preço: " + lojaProduto[i][j]);
    	 }
     }
     entrada.close();
	}

}
