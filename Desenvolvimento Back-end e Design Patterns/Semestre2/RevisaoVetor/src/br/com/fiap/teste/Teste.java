package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.excecoes.Excecao;

public class Teste {

	public static String retornaValorTotal(Veiculo veiculo[], int indice){
		int i = 0;
		double valorTotal = 0;
		for(i = 0; i < indice; i++) valorTotal = valorTotal + veiculo[i].getValor();
		return "O valor total é: " + valorTotal;
	}
	public static String retornaMediaValor(Veiculo veiculo[], int indice){
		int i = 0;
		double media = 0;
		for(i = 0; i < indice; i++) media = media + veiculo[i].getValor();
		return "O valor médio é: " + media/indice;
	}
	public static String retornaMaisCaro(Veiculo veiculo[], int indice){
		int i = 0;
		double maisCaro = veiculo[0].getValor();
		for(i = 1; i < indice; i++) 
			if(maisCaro < veiculo[i].getValor()) maisCaro = veiculo[i].getValor();
		return "O valor do mais caro é: " + maisCaro;
	}
	
	public static void main(String[] args) throws Excecao {
		
		int resp = 0, indice = 0, indice2 = 0, i = 0, j = 0;
		Veiculo objVeiculo[] = new Veiculo[5];
		try {
		while(resp == 0){
		
		objVeiculo[indice] = new Veiculo();		
		objVeiculo[indice].setAno(Integer.parseInt(JOptionPane.showInputDialog
				         ("Digite o ano do veículo: ")));
		objVeiculo[indice].setModelo(JOptionPane.showInputDialog
				            ("Digite o modelo do veículo: "));
		objVeiculo[indice].setMontadora(JOptionPane.showInputDialog
				               ("Digite o nome da montadora: "));
		objVeiculo[indice].setValor(Double.parseDouble(JOptionPane.showInputDialog
				           ("Digite o valor do veículo: ")));
		//JOptionPane.showMessageDialog(null, objVeiculo.getTudo());
		Acessorio objAcessorio[] = new Acessorio[3];
		resp = 0;
		indice2 = 0;
		while(resp == 0){
		
		objAcessorio[indice2] = new Acessorio();
		objAcessorio[indice2].setDescricao(JOptionPane.showInputDialog
				                 ("Digite a descrição do acessório: "));
		objAcessorio[indice2].setValor(Double.parseDouble(JOptionPane.showInputDialog
				             ("Digite o valor do acessório: ")));
		indice2++;
		resp = JOptionPane.showConfirmDialog(null, "Deseja inserir mais acessórios?"
		                                    + JOptionPane.YES_NO_CANCEL_OPTION 
				                            + JOptionPane.QUESTION_MESSAGE);
		}
		objVeiculo[indice].setAcessorio(objAcessorio);
		//for(i = 0; i < indice; i++) JOptionPane.showMessageDialog
		//(null, objAcessorio[i].getTudo());
		indice++;
		resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais veículos?" +
		                                           "??" + 
				                                   JOptionPane.YES_NO_CANCEL_OPTION + 
				                                   JOptionPane.QUESTION_MESSAGE);
	    }
		/*for(i = 0; i < indice; i++){
			JOptionPane.showMessageDialog(null, objVeiculo[i].getTudo());
			for(j = 0; j < objVeiculo[i].getAcessorio().length; j++){
				JOptionPane.showMessageDialog(null, objVeiculo[i].getAcessorio()[j].getTudo());
			}
		}*/
		//JOptionPane.showMessageDialog(null, retornaValorTotal(objVeiculo, indice));
		//JOptionPane.showMessageDialog(null, retornaMediaValor(objVeiculo, indice));
		//JOptionPane.showMessageDialog(null, retornaMaisCaro(objVeiculo, indice));
		
	}
		catch(Exception e){
			throw new Excecao("Deu ruim", e);
		}
	}
}
