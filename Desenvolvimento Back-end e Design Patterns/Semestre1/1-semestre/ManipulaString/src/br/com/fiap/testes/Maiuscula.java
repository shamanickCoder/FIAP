package br.com.fiap.testes;

/*import java.util.Scanner;*/

import javax.swing.JOptionPane;

public class Maiuscula {

	public static void main(String[] args) {
		/*String palavra = new String();*/
		String palavra2 = new String();
		/*Scanner leia = new Scanner(System.in);*/
		String troca = new String();
        
        /*palavra = leia.nextLine();*/
        palavra2 = JOptionPane.showInputDialog("Digite uma palavra: ").toUpperCase();
        /*System.out.println(palavra.toUpperCase());*/
        JOptionPane.showMessageDialog(null, palavra2);      
        troca = JOptionPane.showInputDialog("Digite uma palavra: ").replace('a', '*').replace('e', '*').replace('i', '*').replace('o','*').replace('u', '*');
        /*troca = troca.replace('a', '*').replace('e', '*').replace('i', '*').replace('o','*').replace('u', '*');*/
        JOptionPane.showMessageDialog(null, troca);
	}

}
