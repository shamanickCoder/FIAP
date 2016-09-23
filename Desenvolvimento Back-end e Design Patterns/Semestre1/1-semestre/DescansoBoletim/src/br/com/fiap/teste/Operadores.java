package br.com.fiap.teste;

public class Operadores {
	public static void main(String[] args) {
		int m = 2*10;
		System.out.println("Multiplicando 2*10 = " + m);
		double d = 10/2;
		System.out.println("Dividindo 10 por 2 = " + d);
		int r = 10%3;
		System.out.println("Resto da divisão de 10 por 3 = " + r);
		int i = m++;
		System.out.println("Incrementando " + i + " em 1 = " + m);
		int j = ++m;
		System.out.println(j);
	}
}
