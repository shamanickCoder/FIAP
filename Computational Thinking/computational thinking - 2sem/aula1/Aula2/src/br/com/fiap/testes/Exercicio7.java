package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double valor[] = new double[10];
      double total = 0, totalGeral = 0;
      int quantidade[] = new int[10];
      int i = 0, maiorQuant = 0, posicaoMaiorQuant = 0;
      Scanner leitura = new Scanner(System.in);
      
      for(i = 0; i < 10; i++){
    	  System.out.println("Digite o preço: ");
    	  valor[i] = leitura.nextDouble();
    	  System.out.println("Digite a quantidade: ");
    	  quantidade[i] = leitura.nextInt();
    	  
    	  if(i == 0) maiorQuant = quantidade[i];
    	  
    	  if(maiorQuant < quantidade[i]) posicaoMaiorQuant = i;
      }
      
      System.out.println("Relatório de vendas: ");
      
      for(i = 0; i < 10; i++){
    	  total = quantidade[i]*valor[i];
    	  totalGeral = totalGeral + total;
    	  System.out.println("QUANTIDADE: " + quantidade[i] + " - PREÇO: R$" + valor[i] + " - TOTAL: " + total);
    	  total = 0;
      }
      
      System.out.println("TOTAL GERAL: " + totalGeral);
      
      System.out.println("COMISSÃO: " + totalGeral*0.05);
      
      System.out.println("PREÇO DA MAIOR QUANTIDADE: " + valor[posicaoMaiorQuant]);
      
      leitura.close();
	}

}
