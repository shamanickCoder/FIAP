package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio2Aula7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int matriz[][] = new int[5][4];
        Scanner entrada = new Scanner(System.in);
        int i = 0, j = 0, totalTotal = 0;
        int totalMes[] = new int[5];
        int totalSemana[] = new int[4];
        
        
        for(i = 0; i < 5; i++){
        	for(j = 0; j < 4; j++){
        		System.out.println("Digite o valor da venda da loja " + (i+1) + "na semana " + (j+1) + ":");
            	matriz[i][j] = entrada.nextInt();
            	totalTotal = totalTotal + matriz[i][j];
        	}
        }
        for(i = 0; i < 5; i++) totalMes[i] = 0;
        
        for(i = 0; i < 4; i++) totalSemana[i] = 0;
        for(i = 0; i < 5; i++){
        	for(j = 0; j < 4; j++){
        		totalMes[i] = totalMes[i] + matriz[i][j];
        		totalSemana[j] = totalSemana[j] + matriz[i][j];
        	}
        }
        for(i = 0; i < 5; i++) System.out.println("Total loja " + i + ": " + totalMes[i]);
        for(i = 0; i < 4; i++) System.out.println("Total semana " + i + ": " + totalSemana[i]);
        System.out.println("Total geral: " + totalTotal);
        entrada.close();
	}

}
