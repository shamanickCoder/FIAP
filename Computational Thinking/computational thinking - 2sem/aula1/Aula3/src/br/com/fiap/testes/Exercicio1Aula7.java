package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio1Aula7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int matriz[][] = new int[4][5];
        Scanner entrada = new Scanner(System.in);
        int i = 0, j = 0;
        
        for(i = 0; i < 4; i++){
        	j = 0;
        	System.out.println("Digite o código: ");
        	matriz[i][j] = entrada.nextInt();
        	j++;
        	System.out.println("Digite a quantidade: ");
        	matriz[i][j] = entrada.nextInt();
        	j++;
        	System.out.println("Digite a categoria: ");
        	matriz[i][j] = entrada.nextInt();
        	if(matriz[i][j] == 1){
        		matriz[i][j+1] = 10000;
        		matriz[i][j+2] = matriz[i][j-1]+10000;
        	}
        	else if(matriz[i][j] == 2){
        		matriz[i][j+1] = 5000;
        		matriz[i][j+2] = matriz[i][j-1]+5000;
        	}
        	else {
        		matriz[i][j+1] = 0;
        		matriz[i][j+2] = matriz[i][j-1];
        	}
        	j++;
        }
        for(i = 0; i < 4; i++){
        	j = 0;
        	System.out.println("Código do cliente: " + matriz[i][j]);
        	j++;
        	System.out.println("\tQuant. Milhagem: " + matriz[i][j]);
        	j++;
        	System.out.println("\tCategoria: "+ matriz[i][j]);
        	j++;
        	System.out.println("\tBônus: " + matriz[i][j]);
        	j++;
        	System.out.println("\tMilhagem atual: " + matriz[i][j]);
        }
        entrada.close();
	}

}
