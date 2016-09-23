package br.com.fiap.teste;

public class Condicionais {
	public static void main(String[] args) {
        int a = 2;
        int b = 4;
        boolean c = true;
        boolean d = false;
        System.out.println(a + " igual a " + b + " : " + (a==b));
        System.out.println(a + " maior que " + b + " : " + (a>b));
        System.out.println(a + " menor que " + b + " : " + (a<b));
        System.out.println(c + " && " + d + " = " + (c&&d));
        System.out.println(d + " && " + c + " = " + (d&&c));
        System.out.println(c + " || " + d + " = " + (c||d));
	}
}
