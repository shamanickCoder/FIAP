package br.com.fiap.beans;

public class Sala {
 private int numSala;
 private int numAndar;
 private int sqAula;
 private int qtCapacidade;
 private String observacao;
 
public Sala() {
	super();
}
public Sala(int numSala, int numAndar, int sqAula, int qtCapacidade, String observacao) {
	super();
	this.numSala = numSala;
	this.numAndar = numAndar;
	this.sqAula = sqAula;
	this.qtCapacidade = qtCapacidade;
	this.observacao = observacao;
}
public int getNumSala() {
	return numSala;
}
public void setNumSala(int numSala) {
	this.numSala = numSala;
}
public int getNumAndar() {
	return numAndar;
}
public void setNumAndar(int numAndar) {
	this.numAndar = numAndar;
}
public int getSqAula() {
	return sqAula;
}
public void setSqAula(int sqAula) {
	this.sqAula = sqAula;
}
public int getQtCapacidade() {
	return qtCapacidade;
}
public void setQtCapacidade(int qtCapacidade) {
	this.qtCapacidade = qtCapacidade;
}
public String getObservacao() {
	return observacao;
}
public void setObservacao(String observacao) {
	this.observacao = observacao;
}
 
 
}
