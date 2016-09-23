package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int vetor1[] = new int[10];
      int vetor2[] = new int[10];
      int vetorResultante[] = new int[20];
      int i = 0, j = 0, k = 1;
      Scanner leitura = new Scanner(System.in);
      
      for(i = 0; i < 10; i++){
    	  System.out.println("Posição " + (i+1) + " do Vetor 1: ");
    	  vetor1[i] = leitura.nextInt();
    	  System.out.println("Posição " + (i+1) + " do Vetor 2: ");
    	  vetor2[i] = leitura.nextInt();
    	  
    	  vetorResultante[j] = vetor1[i];
    	  vetorResultante[k] = vetor2[i];
    	  
    	  j = j + 2;
    	  k = k + 2;
      }
      
      System.out.println("Vetor 1:");
      for(i = 0; i < 10; i ++){
    	  System.out.println(vetor1[i]);
      }
      System.out.println("Vetor 2: ");
      for(i = 0; i < 10; i++){
    	  System.out.println(vetor2[i]);
      }
      System.out.println("Vetor resultante: ");
      for(i = 0; i < 20; i++){
    	  System.out.println(vetorResultante[i]);
      }
      
      
      leitura.close();
	}

}
