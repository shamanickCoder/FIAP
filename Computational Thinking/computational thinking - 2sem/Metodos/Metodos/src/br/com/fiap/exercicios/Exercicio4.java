package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void verificarAumento(String nome[], double salario[], int tempoServico[]){
		int i = 0;
		
		for(i = 0; i < 4; i++){
			if(tempoServico[i] > 3 || salario[i] < 700){
				System.out.println(nome[i] + " terá aumento");
			}
			else {
				System.out.println(nome[i] + " nao terá aumento");
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome[] = new String[4];
		double salario[] = new double[4];
		int tempoServico[] = new int[4];
		int i = 0;
		
		for (i = 0; i < 4; i++){
			System.out.println("Nome: ");
			nome[i] = entrada.next();
			System.out.println("Salario: ");
			salario[i] = entrada.nextDouble();
			tempoServico[i] = entrada.nextInt();
		}
		
		verificarAumento(nome, salario, tempoServico);
		
		entrada.close();
	}

}
