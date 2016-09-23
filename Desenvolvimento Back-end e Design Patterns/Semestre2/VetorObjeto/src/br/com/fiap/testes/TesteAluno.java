package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteAluno {

	public static void exibirMedia(Aluno obj[], int indice){
		double mediaTotal = 0;
		int i = 0;
		
		for(i = 0; i < indice; i++){
			mediaTotal = mediaTotal + obj[i].getMedia();
		}
		JOptionPane.showMessageDialog(null, "A média dos alunos é: " + mediaTotal/indice);
		
	}
	
	public static void exibirFaltas(Aluno obj[], int indice){
		int totalFaltas = 0;
		int i = 0;
		
		for(i = 0; i < indice; i++){
			totalFaltas = totalFaltas + obj[i].getFaltas();
		}
		JOptionPane.showMessageDialog(null, "O total de faltas é: " + totalFaltas);
	}
	
	public static void exibirIdades(Aluno obj[], int indice){
		int mediaIdades = 0;
		int i = 0;
		
		for(i = 0; i < indice; i++){
			mediaIdades = mediaIdades + obj[i].getIdade();
		}
		JOptionPane.showMessageDialog(null, "A média das idades é: " + mediaIdades/indice);
	}
	
	
	public static void exibirIdadeMaior(Aluno obj[], int indice){
		int i = 0, posicaoMaior = 0;
		int idadeMaior = obj[0].getIdade();
		
		for(i = 1; i < indice; i++){
			if(idadeMaior < obj[i].getIdade()){
				idadeMaior = obj[i].getIdade();
				posicaoMaior = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O aluno mais velho é o " + obj[posicaoMaior].getNome() + "\nIdade: " + obj[posicaoMaior].getIdade());
	}
	public static void exibirIdadeMenor(Aluno obj[], int indice){
		int i = 0, posicaoMenor = 0;
		int idadeMenor = obj[0].getIdade();
		
		for(i = 1; i < indice; i++){
			if(idadeMenor > obj[i].getIdade()){
				idadeMenor = obj[i].getIdade();
				posicaoMenor = i;
			}
		}
		JOptionPane.showMessageDialog(null, "O aluno mais novo é o " + obj[posicaoMenor].getNome() + "\nIdade: " + obj[posicaoMenor].getIdade());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int resp = 0, intFaltas = 0, intIdade = 0, indice = 0, i = 0;
      double dblMedia = 0;
      String strNome = null;
      Aluno[] objeto = new Aluno[3];
      
      while(resp == 0 && indice < 3){
    	  strNome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
    	  dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a média: "));
    	  intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas: "));
    	  intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
    	  
    	  objeto[indice] = new Aluno();
    	  objeto[indice].setNome(strNome);
    	  objeto[indice].setMedia(dblMedia);
    	  objeto[indice].setFaltas(intFaltas);
    	  objeto[indice].setIdade(intIdade);
    	  
    	  indice++;
    	  
    	  resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      }
      
      /*
     
      /*for(i = 0; i < indice; i++){
    	  System.out.println("\n" + objeto[i].getNome() + "\n" + objeto[i].getMedia());
      }
      
    ///VETOR FOREACH: sempre varre toda a estrutura
       for(Aluno aluno : objeto){
          System.out.println("\n" + aluno.getNome() + "\n" + aluno.getMedia());
        }
       
      */ 
      
      exibirMedia(objeto, indice);
      exibirFaltas(objeto, indice);
      exibirIdades(objeto, indice);
      exibirIdadeMaior(objeto, indice);
      exibirIdadeMenor(objeto, indice);
	}

}
