package br.com.fiap.testes;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int matrizNumeros[][] = new int [3][3];
        int i = 0, j = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(i = 0; i < 3; i++){
        	for(j = 0; j < 3; j++){
        		System.out.println("Matriz["+i+"] - ["+j+"] = ");
        		matrizNumeros[i][j] = entrada.nextInt();
        	}
        }
        
        for(i = 0; i < 3; i++){
        	for(j = 0; j < 3; j++){
        		System.out.println("Matriz["+i+"] - ["+j+"] = " + matrizNumeros[i][j]);
        		
        	}
        }
        
        for(i = 0; i < 3; i++){
        	for(j = 0; j < 3; j++){
        		System.out.print(matrizNumeros[i][j] + "\t");
        		
        	}
        	System.out.println("");
        }
        
        entrada.close();
	}

}
