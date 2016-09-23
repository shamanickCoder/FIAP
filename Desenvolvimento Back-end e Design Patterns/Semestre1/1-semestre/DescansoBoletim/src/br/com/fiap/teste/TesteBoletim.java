package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Boletim;

public class TesteBoletim {

	public static void main(String[] args) {
		Aluno testeAluno = new Aluno(JOptionPane.showInputDialog("Digite o nome: "), 
				                     JOptionPane.showInputDialog("Digite o RM: "), 
				                     JOptionPane.showInputDialog("Digite o telefone: "));
		
		Boletim testeBoletim = new Boletim();
		/*ALTERNATIVAS PARA CRIAR O OBJETO ALUNO E DEFINIR SEUS VALORES 
		 
		 Aluno testeAluno = new Aluno();
		          ou
		Aluno testeAluno = new Aluno();
		testeAluno.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		testeAluno.setRM(JOptionPane.showInputDialog("Digite o RM: "));
		testeAluno.setFone(JOptionPane.showInputDialog("Digite o telefone: "));
		
		Boletim objBoletim2 = new Boletim(new Aluno("","",""), 12, 12, 12);
		*/
		
		testeBoletim.setAluno(testeAluno);
		testeBoletim.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas: ")));
		testeBoletim.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")));
		testeBoletim.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")));
		
		JOptionPane.showMessageDialog(null, "Aluno: " + 
		                                    testeBoletim.getAluno().getNome() + 
		                                    "\n" + "Média: " + 
		                                    testeBoletim.exibirMedia(testeBoletim.getNota1(), testeBoletim.getNota2()));
	}
}
