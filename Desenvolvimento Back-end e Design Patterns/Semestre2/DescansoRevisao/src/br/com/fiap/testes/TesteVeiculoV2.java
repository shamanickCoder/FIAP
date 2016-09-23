package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;

public class TesteVeiculoV2 {

	public static void main(String[] args) {
		Veiculo meusVeiculos[]=new Veiculo[5];
		int respV = 0;
		int iVeiculo=0;
		while(respV==0 && iVeiculo<5){
		String strMontadora=JOptionPane.showInputDialog("Digite a montadora");
		String strModelo=JOptionPane.showInputDialog("Digite o modelo");
		double dblValor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		int intAno=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
		int resp=0;
		int iAcessorio =0;
		Acessorio meusAcessorios[] = new Acessorio[3];
		while(resp==0 && iAcessorio<3){
			String strDescricao=JOptionPane.showInputDialog("Descrição do Acessório");
			double dblValorAcessorio=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
			meusAcessorios[iAcessorio]=new Acessorio();
			meusAcessorios[iAcessorio].setDescricao(strDescricao);
			meusAcessorios[iAcessorio].setValor(dblValorAcessorio);
			iAcessorio++;
			resp=JOptionPane.showConfirmDialog(null, "+ Acessórios", "Título", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		Veiculo v = new Veiculo();
		v.setAno(intAno);
		v.setModelo(strModelo);
		v.setMontadora(strMontadora);
		v.setValor(dblValor);
		v.setAcessorios(meusAcessorios);
		meusVeiculos[iVeiculo]=v;
		iVeiculo++;
		respV=JOptionPane.showConfirmDialog(null, "+ Veículos", "Título", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
	}

}
