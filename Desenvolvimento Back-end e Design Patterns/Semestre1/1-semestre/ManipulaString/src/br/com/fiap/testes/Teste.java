package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno teste = new Aluno();
		teste.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		JOptionPane.showMessageDialog(null, teste.getNome());
		teste.setEmail(JOptionPane.showInputDialog("Digite seu email: "));
		JOptionPane.showMessageDialog(null, teste.getEmail());
        teste.setCpf(JOptionPane.showInputDialog("Digite o seu CPF: "));
        JOptionPane.showMessageDialog(null, teste.getCpf());
        teste.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog("Digite sua mensalidade: ")));
        JOptionPane.showMessageDialog(null, teste.getMensalidade());
        teste.setSexo(JOptionPane.showInputDialog("Digite seu sexo: ").charAt(0));
        JOptionPane.showMessageDialog(null, teste.getSexo());
	}

}
