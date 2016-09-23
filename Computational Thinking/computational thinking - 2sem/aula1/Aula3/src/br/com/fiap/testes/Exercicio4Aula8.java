package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio4Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 0, j = 0;
        int M[][] = new int[2][2];
        int R[][] = new int [2][2];
        int maiorElemento = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(i = 0; i < 2; i++){
        	for(j = 0; j < 2; j++){
        		System.out.println("Informe um número M["+(i+1)+"]["+(j+1)+"]: ");
        		M[i][j] = entrada.nextInt();
        	}
        }
        maiorElemento = M[0][0];
        for(i = 0; i < 2; i++){
        	for(j = 0; j < 2; j++){
        		if(maiorElemento < M[i][j]) maiorElemento = M[i][j];
        	}
        }
        for(i = 0; i < 2; i++){
        	for(j = 0; j < 2; j++){
        		R[i][j] = M[i][j]*maiorElemento;
        	}
        }
        for(i = 0; i < 2; i++){
        	for(j = 0; j < 2; j++){
        		System.out.println("Resultado - Matriz R["+(i+1)+"]["+(j+1)+"]: " + R[i][j]);
        	}
        }
        entrada.close();
	}

}
