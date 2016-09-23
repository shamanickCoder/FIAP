package br.com.fiap.teste;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteTamanho {
	public static void main(String[] args) {
       String nome1 = new String(""), nome2 = new String("");
       float altura1 = 0, altura2 = 0;
       float peso1 = 0, peso2 = 0;
       Scanner leitura = new Scanner(System.in);
       
       /*System.out.println("Digite seu nome: ");
       nome1 = leitura.next();
       System.out.println("Digite sua altura: ");
       altura1 = leitura.nextFloat();
       System.out.println("Digite seu peso: ");       
       peso1 = leitura.nextFloat();*/
       
       nome1 = JOptionPane.showInputDialog("Digite seu nome: ");
       altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
       peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
       nome2 = JOptionPane.showInputDialog("Digite seu nome: ");
       altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
       peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
       
       if (peso1 > peso2){
    	   JOptionPane.showMessageDialog(null, "A mais pesada é: " + nome1);
       }
       else if (peso1 < peso2){
    	   JOptionPane.showMessageDialog(null, "A mais pesada é: " + nome2);
       }
       else {
    	   JOptionPane.showMessageDialog(null, "Mesmo peso.");
       }
       if (altura1 > altura2){
    	   JOptionPane.showMessageDialog(null, "A mais alta é: " + altura1);
       }
       else if (altura1 < altura2){
    	   JOptionPane.showMessageDialog(null, "A mais alta é: " + altura2);
       }
       else {
    	   JOptionPane.showMessageDialog(null, "Mesma altura.");
       }
	}
}
