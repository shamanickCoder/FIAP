package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.excecoes.Excecoes;

public class TesteCliente2 {

	public static void main(String[] args) throws Excecoes{
		// TODO Auto-generated method stub
      List<Telefone> meusFones = new ArrayList<Telefone>();
      int resp = 0;
      String strNome = JOptionPane.showInputDialog("Digite  nome do cliente: ");
      
      while(resp == 0){
    	  short shoDdd = Short.parseShort(JOptionPane.showInputDialog("Digite o DDD do telefone: "));
    	  int intNum = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone: "));
    	  Telefone telefone = new Telefone(shoDdd, intNum);
    	  meusFones.add(telefone);
    	  
    	  resp = JOptionPane.showConfirmDialog(null,"Cadastrar mais telefones?",
    			  "Arraylist de objetos", JOptionPane.YES_NO_OPTION,
    			  JOptionPane.QUESTION_MESSAGE);
      }
      Cliente pessoa = new Cliente();
      pessoa.setNome(strNome);
      pessoa.setTels(meusFones);
      System.out.println(pessoa.getNome());
      for(Telefone tel: pessoa.getTels()){
    	  System.out.println(tel.getTelefone());
    	  //JOptionPane.showMessageDialog(null, tel.getTelefone());
      }
      
	}

}
