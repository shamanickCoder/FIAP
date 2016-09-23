package br.com.fiap.testes;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Estado;

public class TesteEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Integer> ddds = new HashSet<Integer>();
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sigla = JOptionPane.showInputDialog("Digite a sigla: ");
        int resp = 0;
        
        while(resp == 0){
        	ddds.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o ddd: ")));
        	
        	resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        Estado objEstado = new Estado(nome, sigla, ddds);
        
        JOptionPane.showMessageDialog(null, "Nome: " + objEstado.getNome() + "\nSigla: " + objEstado.getSigla() + "\nddd: " + objEstado.getDdd());
        JOptionPane.showMessageDialog(null, ddds);
        
	}

}
