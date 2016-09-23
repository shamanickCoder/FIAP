package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Fabricante;
import br.com.fiap.modelo.Produto;
import br.com.fiap.modelo.Telefone;

public class Teste4 {

	public static void main(String[] args) {
		Telefone objTelefone = new Telefone();
		Produto objProduto = new Produto();
		Fabricante objFabricante = new Fabricante();
		
		objTelefone.setDDD(JOptionPane.showInputDialog("Digite o DDD: "));
		objTelefone.setNumero(JOptionPane.showInputDialog("Digite o número do telefone:"));
		objTelefone.setOperadora(JOptionPane.showInputDialog("Digite o nome da operadora: "));
		
		objFabricante.setEmail(JOptionPane.showInputDialog("Digite o email do fabricante: "));
		objFabricante.setNome(JOptionPane.showInputDialog("Digite o nome do fabricante: "));
		objFabricante.setFone(objTelefone);
		
		objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		objProduto.setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto: "));
		objProduto.setMarca(objFabricante);
		
		JOptionPane.showMessageDialog(null, "Código do produto: " + objProduto.getCodigo());
		JOptionPane.showMessageDialog(null, "Valor do produto: " + objProduto.getValor());
		JOptionPane.showMessageDialog(null, "Descrição do produto: " + objProduto.getDescricao());
		JOptionPane.showMessageDialog(null, "Informações da marca: \n" + objProduto.getMarca().getTudo());
	}

}
