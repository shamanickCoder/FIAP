package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.excecoes.Excecoes;

public class TesteContaCorrente{

	public static void main(String[] args) throws Excecoes{
		// TODO Auto-generated method stub
		ContaCorrente objContaCorrente = new ContaCorrente();
		
		objContaCorrente.setSaldo(10000);
		objContaCorrente.sacar(Double.parseDouble(JOptionPane.showInputDialog("Deseja sacar quanto?")));
		JOptionPane.showMessageDialog(null, objContaCorrente.getSaldo());
		objContaCorrente.depositar(Double.parseDouble(JOptionPane.showInputDialog("Deseja depositar quanto?")));
		JOptionPane.showMessageDialog(null, objContaCorrente.getSaldo());
        objContaCorrente.setLimiteCredito(Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de crédito:")));
        JOptionPane.showMessageDialog(null, objContaCorrente.getLimiteCredito());
        
        
        
	}

}
