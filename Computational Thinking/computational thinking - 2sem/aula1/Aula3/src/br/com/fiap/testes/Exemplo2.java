package br.com.fiap.testes;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [4][4];
        int i = 0, j = 0, somaLinha = 0, somaColuna = 0, somaTotal = 0;
        
        for(i = 0; i < 4; i++){
        	for(j = 0; j < 4; j++){
        		System.out.println("Matriz["+i+"]["+j+"] = ");
        		matriz[i][j] = entrada.nextInt();
        		somaLinha = somaLinha + matriz[i][j];
        		somaColuna = somaColuna + matriz[j][i];
        	}
        	somaTotal = somaTotal + somaLinha;
        	System.out.println("Soma linha = " + somaLinha);
        	somaLinha = 0;
        	System.out.println("Soma coluna = " + somaColuna);
        	somaColuna = 0;
        }
        System.out.println("A soma total é = " + somaTotal);
        
        entrada.close();
	}

}
