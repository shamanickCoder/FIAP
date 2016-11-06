package br.com.fiap.beans;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros = 0.0d;

	public ContaPoupanca(double taxaJuros) {
		super();
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {

	}

}