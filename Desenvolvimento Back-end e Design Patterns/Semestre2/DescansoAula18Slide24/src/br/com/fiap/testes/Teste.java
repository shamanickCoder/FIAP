package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.excecoes.Excecao;

public class Teste {

	
	public static int ReturnTotalFuncionario(int indice){
		return indice; 
	}
	public static String retornaMediaSalario(Funcionario f[], int indice){
		int i = 0;
		double media = 0;
		for (i = 0; i < indice; i++){
			media = media + f[i].getSalario();
		}
		return "A média dos salários é: " + media/indice;
	}
	public static String totalFolha(Funcionario f[], int indice){
		int i = 0;
		double totalFolha = 0;
		for(i = 0; i < indice; i++) totalFolha = totalFolha + f[i].getSalario();
		return "O total da folha é: " + totalFolha;
	}
	public static void imprimirNome(Funcionario f[], int indice){
		int i = 0;
		for(i = 0; i < indice; i++) JOptionPane.showMessageDialog(null, f[i].getNome());
	}
	public static void imprimirOrdemCrescSalario(Funcionario f[], int indice){
	    int i = 0, j = 0;
	    double menor = 0;
	    for(i = 0; i < indice; i++){
	    	
	    	for(j = 0; j < i; j++){
	    		if(f[i].getSalario() < f[j].getSalario()){
	    			menor = f[j].getSalario();
	    			f[j].setSalario(f[i].getSalario());
	    			f[i].setSalario(menor);
	    		}
	    	}
	    }
	    for(i = 0; i < indice; i++) JOptionPane.showMessageDialog(null, f[i].getSalario());
	}
	public static void imprimirOrdemCrescCargo(Funcionario f[], int indice){
		int i = 0, j = 0;
		String cargo = null;
		
		for(i = 0; i < indice; i++){
			for(j = 0; j < i; j++){
				if(f[i].getCargo().toLowerCase().charAt(0) == 'e'){
					if(f[j].getCargo().toLowerCase().charAt(0) == 'j' || 
					   f[j].getCargo().toLowerCase().charAt(0) == 'p'){
						cargo = f[j].getCargo();
						f[j].setCargo(f[i].getCargo());
						f[i].setCargo(cargo);
					}
				}
				else if(f[i].getCargo().toLowerCase().charAt(0) == 'j'){
					if(f[j].getCargo().toLowerCase().charAt(0) == 'p'){
						cargo = f[j].getCargo();
						f[j].setCargo(f[i].getCargo());
						f[i].setCargo(cargo);
					}
				}
			}
		}
		for(i = 0; i < indice; i++)
			if(f[i].getFalta() > 3)
			JOptionPane.showMessageDialog(null, f[i].getCargo());
	}
	public static void excluirFunc(Funcionario f[], int indice){
		int i = 0, j = 0;
		for(i = 0; i < indice; i++){
			if(f[i].getSalario() > 6000){
				for(j = i +1; j < indice; j++){
					f[j-1] = f[j];
				}
				indice--;
			}
		}
		for(i = 0; i < indice; i++) JOptionPane.showMessageDialog(null, f[i].getTudo());
	}
	
	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
        
		Funcionario objFuncionario[] = new Funcionario[Integer.parseInt(
				JOptionPane.showInputDialog
				("Digite o tamanho do vetor: "))];
		int i = 0;
		try{
        
        do {
        
        objFuncionario[i] = new Funcionario();
        
        objFuncionario[i].setCargo
                          (JOptionPane.showInputDialog("Digite o cargo"));
        objFuncionario[i].setFalta(Integer.parseInt
                         (JOptionPane.showInputDialog
                         ("Digite a quantidade de faltas: ")));
        objFuncionario[i].setNome(JOptionPane.showInputDialog("Digite o nome: "));
        objFuncionario[i].setSalario(Double.parseDouble(
        		          JOptionPane.showInputDialog
        		          ("Digite o salário: ")));
        i++;
        
        
        //JOptionPane.showMessageDialog(null, "Total de funcionários: " + totalFuncionario);
        //JOptionPane.showMessageDialog(null, objFuncionario.getTudo());
        //JOptionPane.showMessageDialog(null, "A média dos salários é: " + mediaGeral);
        
        } while(JOptionPane.showConfirmDialog(null, "Desejar cadastrar mais funcionários?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		}
		catch(Exception e){
			throw new Excecao("Deu ruim jão.", e);
		}
        //JOptionPane.showMessageDialog(null, "O total de funcionários é: " + ReturnTotalFuncionario(i));
        //JOptionPane.showMessageDialog(null, retornaMediaSalario(objFuncionario, i));
        //imprimirNome(objFuncionario, i);
       finally {
    	   //imprimirOrdemCrescSalario(objFuncionario, i);
    	   imprimirOrdemCrescCargo(objFuncionario, i);
    	   //excluirFunc(objFuncionario, i);
       }
	}

}
