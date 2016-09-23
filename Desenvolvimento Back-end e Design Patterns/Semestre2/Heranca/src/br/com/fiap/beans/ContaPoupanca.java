package br.com.fiap.beans;

public class ContaPoupanca extends ContaBancaria{
 private double taxaJuros;

public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta, double taxaJuros) {
	super(saldo, titular, agencia, numeroConta);
	this.taxaJuros = taxaJuros;
}

public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta) {
	super(saldo, titular, agencia, numeroConta);
}

public double getTaxaJuros() {
	return taxaJuros;
}

public void setTaxaJuros(double taxaJuros) {
	this.taxaJuros = taxaJuros;
}
 
 
}
