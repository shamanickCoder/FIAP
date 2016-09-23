package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> cargos = new ArrayList<String>();
       int i = 0, resp = 0, j = 0;
       //String resp = new String();
       
       //resp = JOptionPane.showInputDialog("Deseja inserir um cargo (sim/não)?").toLowerCase();
       resp = JOptionPane.showConfirmDialog(null, "Deseja adicionar um cargo?", "Oi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       
       while(resp == 0){
    	   cargos.add(JOptionPane.showInputDialog("Digite o cargo: "));
    	   i++;
    	   //resp = JOptionPane.showInputDialog("Deseja inserir outro cargo?(sim/não)");
    	   resp = JOptionPane.showConfirmDialog(null, "Deseja inserir outro?", "Oi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       }
      
       System.out.println(cargos);
       Collections.sort(cargos);
       System.out.println(cargos);
       
       for(j = 0; j < i; j++){
    	   System.out.println(cargos.get(j).toUpperCase());
       }
       
       String posicaoCargo = JOptionPane.showInputDialog("O que deseja buscar?");
       
       if(cargos.indexOf(posicaoCargo) >= 0){
    	   System.out.println("Existe na lista");
       }
       //se não encontrar na posição, ele retorna o valor -1, entrando no else
       else {
    	   System.out.println("Não existe na lista");
       }
	}

}
