import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //Criar um vetor para armazenar 5 nomes
		
       String[] nome = new String[5]; 
       Scanner leitura = new Scanner(System.in);
       int i;
       
       //Carregar o vetor
       for(i = 0; i < 5; i++){
    	   System.out.println("Digite o nome: ");
    	   nome[i] = leitura.next();
       }
       
       //Exibir os dados carregados
       for(i = 0; i < 5; i++){
    	   System.out.println(nome[i]);
       }
       
       leitura.close();
	}

}
