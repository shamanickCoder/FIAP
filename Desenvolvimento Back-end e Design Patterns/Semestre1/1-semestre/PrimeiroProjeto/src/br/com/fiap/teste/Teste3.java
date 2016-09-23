package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Fabricante;
import br.com.fiap.modelo.Produto;

public class Teste3 {

	public static void main(String[] args) {
		Fabricante objFabricante = new Fabricante();
		objFabricante.setNome(JOptionPane.showInputDialog("Digite o nome do fabricante: "));
		objFabricante.setEmail(JOptionPane.showInputDialog("Digite o email do fabricante: "));
		objFabricante.setFone(JOptionPane.showInputDialog("Digite o telefone fabricante: "));
		
		Produto objProduto = new Produto();
		objProduto.setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto: "));
		objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		objProduto.setMarca(objFabricante);
		JOptionPane.showMessageDialog(null, "Descrição: " + objProduto.getDescricao());
		JOptionPane.showMessageDialog(null, "Código: " + objProduto.getCodigo());
		JOptionPane.showMessageDialog(null, "Valor: " + objProduto.getValor());
		JOptionPane.showMessageDialog(null, "Nome da marca: " + objProduto.getMarca().getNome());
		
		Produto objProduto2 = new Produto ();
		objProduto2.setTudo
		(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")),
				JOptionPane.showInputDialog("Digite a descrição do produto: "),
				objFabricante, 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		JOptionPane.showMessageDialog(null, "Descrição: " + objProduto2.getDescricao());
		JOptionPane.showMessageDialog(null, "Código: " + objProduto2.getCodigo());
		JOptionPane.showMessageDialog(null, "Valor: " + objProduto2.getValor());
		JOptionPane.showMessageDialog(null, objProduto2.getMarca().getTudo());
	}

}
