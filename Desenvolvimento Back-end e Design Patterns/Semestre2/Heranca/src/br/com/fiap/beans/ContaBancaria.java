package br.com.fiap.beans;

import br.com.fiap.excecoes.Excecoes;

public class ContaBancaria {
 private double saldo;
 private Titular titular;
 private int agencia;
 private String numeroConta;
 
public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta) {
	super();
	this.saldo = saldo;
	this.titular = titular;
	this.agencia = agencia;
	this.numeroConta = numeroConta;
}
public ContaBancaria() {
	super();
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public Titular getTitular() {
	return titular;
}
public void setTitular(Titular titular) {
	this.titular = titular;
}
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public String getNumeroConta() {
	return numeroConta;
}
public void setNumeroConta(String numeroConta) {
	this.numeroConta = numeroConta;
}
 
public void depositar(double valor) throws Excecoes{
	if(valor < 0) throw new Excecoes("Não é possível com valor negativo.");
	else this.saldo = this.saldo + valor;
}
public void sacar(double valor) throws Excecoes{
	if(valor > 0 && valor < this.saldo){
		this.saldo = this.saldo - valor;
	}
	else {
		throw new Excecoes("O valor não pode ser negativo.");
	}
}
 
}
