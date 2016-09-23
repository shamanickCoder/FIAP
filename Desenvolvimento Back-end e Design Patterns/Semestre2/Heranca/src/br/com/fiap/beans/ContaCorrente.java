package br.com.fiap.beans;

import br.com.fiap.excecoes.Excecoes;

public class ContaCorrente extends ContaBancaria{
 private double limiteCredito;

public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
	super(saldo, titular, agencia, numeroConta);
	this.limiteCredito = limiteCredito;
}

public ContaCorrente() {
	super();
}

public double getLimiteCredito() {
	return limiteCredito;
}

public void setLimiteCredito(double limiteCredito) throws Excecoes{
	if(limiteCredito < 0) throw new Excecoes("Não aceita valor negativo.");
	else this.limiteCredito = limiteCredito;
}
 

 
}
