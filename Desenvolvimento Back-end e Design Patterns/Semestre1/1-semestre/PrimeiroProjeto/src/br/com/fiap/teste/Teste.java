package br.com.fiap.teste;
import br.com.fiap.modelo.Produto;
public class Teste {

	public static void main(String[] args) {
           Produto produto1 = new Produto();
           produto1.setDescricao("Churros");
           System.out.println(produto1.getDescricao());
           
           Produto testeAll = new Produto();
           testeAll.setTudo(32, "Paçoca", "Magikitos", 999.50);
           System.out.println(testeAll.getTudo());
           System.out.println(testeAll.getBasico());
           System.out.println(testeAll.getMarcaDetalhada());
           
           Produto testeDesconto = new Produto();
           testeDesconto.setValor(100);
           System.out.println("Valor com desconto: " + testeDesconto.getDesconto());
           testeDesconto.setValor(150);
           System.out.println(testeDesconto.getParcelado());
           
           Produto testeBasico = new Produto();
           testeBasico.setBasico("Bagulho é loko", 666);
           System.out.println(testeBasico.getBasico());
           
           Produto testeAtualizar = new Produto();
           testeAtualizar.setValor(100);
           System.out.println("Valor inicial: " + testeAtualizar.getValor());
           testeAtualizar.setAtualizar(10);
           System.out.println("Valor com acréscimo: " + testeAtualizar.getValor());
	}
}
