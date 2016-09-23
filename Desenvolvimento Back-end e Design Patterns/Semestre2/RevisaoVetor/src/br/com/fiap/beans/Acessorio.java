package br.com.fiap.beans;

public class Acessorio {
 private String descricao;
 private double valor;
 
 
 
public Acessorio() {
	super();
}
public Acessorio(String descricao, double valor) {
	super();
	this.descricao = descricao;
	this.valor = valor;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
 public String getTudo(){
	 return "Descriçao: " + descricao + "\nValor: " + valor;
 }
 
}
