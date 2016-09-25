package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void condicaoPagamento(double total){
		Scanner entrada = new Scanner(System.in);
		int codigo = 0;

		while(codigo <= 0 || codigo > 4){
			System.out.println("Digite o código:");
			codigo = entrada.nextInt();
		}
		switch (codigo) {
		case 1:
			System.out.println("10% de desconto = " + total*0.9);
		case 2:
			System.out.println("5% de desconto = " + total*0.95);
		case 3:
			System.out.println("Duas parcelas de " + total/2);
		case 4:
			System.out.println("TrÊs parcelas de " + (total*1.1)/3);
		default: 
			System.out.println("erro.");
		}

		entrada.close();
	}

	public static void main(String[] args) {
		int quantidade = 0;
		double preco = 0;
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		int i = 0;

		for(i = 0; i < 3; i++){
			System.out.println("Quantidade produto " + (i+1) + ": ");
			quantidade = entrada.nextInt();
			System.out.println("Preço produto " + (i+1) + ": ");
			preco = entrada.nextDouble();
			total = total + (quantidade*preco);
		}
		
		condicaoPagamento(total);

		entrada.close();
	}

}
