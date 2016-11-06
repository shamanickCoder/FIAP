package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class Excecao_03 {
	public static void main(String[] args){
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
		int div = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
		if(div == 0){
			throw new RuntimeException();
		}
		int resultado = nota / div;
		System.out.println("Resultado: " + resultado);
	}
}
