package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecao.Excecoes;

public class Excecoes_Cliente_01 {
	public static void main(String[] args) throws Excecoes{
		try{
			Cliente objCliente = new Cliente();
			objCliente.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o código: ")));
		} catch(Exception e){
			throw new Excecoes("Ocorreu uma falha.", e);
		}
	}

}
