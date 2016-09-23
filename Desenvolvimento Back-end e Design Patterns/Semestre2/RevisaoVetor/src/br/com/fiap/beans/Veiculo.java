package br.com.fiap.beans;

public class Veiculo {
 private int ano;
 private String modelo;
 private double valor;
 private String montadora;
 private Acessorio acessorio[] = new Acessorio[3];
 
 
 
public Veiculo() {
	super();
}
public Veiculo(int ano, String modelo, double valor, String montadora, Acessorio[] acessorio) {
	super();
	this.ano = ano;
	this.modelo = modelo;
	this.valor = valor;
	this.montadora = montadora;
	this.acessorio = acessorio;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getMontadora() {
	return montadora;
}
public void setMontadora(String montadora) {
	this.montadora = montadora;
}
public Acessorio[] getAcessorio() {
	return acessorio;
}
public void setAcessorio(Acessorio[] acessorio) {
	this.acessorio = acessorio;
}
 
public String getTudo(){
	return "Ano: " + ano + "\nModelo: " + modelo + "\nValor: " + valor
			+ "\nMontadora:" + montadora;
}
 
}
