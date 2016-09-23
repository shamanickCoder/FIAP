package br.com.fiap.teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Produto;

public class Teste2 {

	public static void main(String[] args) {
           Produto objProduto = new Produto();
           Scanner teclado = new Scanner(System.in);
           
           /*System.out.println("Digite a descrição do produto: ");
           objProduto.setDescricao(teclado.next() + teclado.nextLine(); obs: nextline é para continuar pegando a string mesmo depois de dar um espaço
           System.out.println("Digite o código do produto: ");
           objProduto.setCodigo(teclado.nextInt());
           System.out.println("Digite o valor do produto: ");
           objProduto.setValor(teclado.nextDouble());
           System.out.println("Digite a marca do produto: ");
           objProduto.setMarca(teclado.next());
           System.out.println("\n" + objProduto.getTudo());*/
           
           Produto objProd2 = new Produto();
           objProd2.setDescricao(JOptionPane.showInputDialog("Digte a descrição: "));
           objProd2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
           objProd2.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
           objProd2.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
           System.out.println(objProd2.getTudo());
           
	}
}
