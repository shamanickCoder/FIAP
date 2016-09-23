package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.excecoes.Excecao;

public class TesteVeiculoV6 {
	static double calcularTotalVeiculos(Veiculo v[], int indice){
		double total =0;
		for(int i=0; i<indice;i++){
			total+=v[i].getValor();
		}
		return total;
	}
	public static void main(String[] args) throws Excecao{
		Veiculo meusVeiculos[]=new Veiculo[5];
		int iVeiculo=0;
		try{
			do{
				int iAcessorio =0;
				Acessorio meusAcessorios[] = new Acessorio[3];
				while(JOptionPane.showConfirmDialog(null, "Lançar Acessórios", "Título", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
					meusAcessorios[iAcessorio]=new Acessorio(JOptionPane.showInputDialog("Descrição do Acessório"),Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
					iAcessorio++;
				}
				meusVeiculos[iVeiculo]=new Veiculo(JOptionPane.showInputDialog("Digite a montadora"),Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")),Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),JOptionPane.showInputDialog("Digite o modelo"),meusAcessorios);
				iVeiculo++;
			}while(JOptionPane.showConfirmDialog(null, "+ Veículos", "Título", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0 && iVeiculo<5);
			for (int v=0;v<iVeiculo;v++){
				System.out.println(meusVeiculos[v].getModelo()+"\n" + meusVeiculos[v].getMontadora() + "\nAcessórios:");
				for(int a=0;a<meusVeiculos[v].getAcessorios().length;a++){
					System.out.println(meusVeiculos[v].getAcessorios()[a].getDescricao() + "\n" + meusVeiculos[v].getAcessorios()[a].getValor());
				}
			}
			System.out.println("Total de Valor: " + calcularTotalVeiculos(meusVeiculos,iVeiculo));
		}catch(Exception e){
			throw new Excecao(e);
		}
	}

}
