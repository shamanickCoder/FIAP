package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void captarCampos(){
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[5][3];
		int i = 0, j = 0;

		for(i = 0; i < 5; i++){

			System.out.println("identificacao funcionario");
			matriz[i][0] = entrada.nextInt();

			System.out.println("codigo do erro: ");
			matriz[i][1] = entrada.nextInt();
			while(matriz[i][1] != 1 || matriz[i][1] != 2 || matriz[i][1] != 3){
				System.out.println("codigo do erro: ");
				matriz[i][1] = entrada.nextInt();
			}

			System.out.println("critero do chamado");
			matriz[i][2] = entrada.nextInt();
			while(matriz[i][2] != 1 || matriz[i][2] != 2 || matriz[i][2] != 3 || matriz[i][3] != 4){
				System.out.println("criterio do chamado: ");
				matriz[i][2] = entrada.nextInt();
			}
		}
		entrada.close();
	}

	public static void exibirRelatorio(int matriz[][], int erro[]){
		int i =0, j = 0;


		for(j = 0; j < 5; j++){
			System.out.println("");
		}

	}

	public static void main(String[] args) {

	}

}
