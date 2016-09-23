package br.com.fiap.beans;

public class Veiculo {
	private String montadora;
	private int ano;
	private double valor;
	private String modelo;
	private Acessorio acessorios[];
	public Veiculo(String montadora, int ano, double valor, String modelo, Acessorio[] acessorios) {
		super();
		this.montadora = montadora;
		this.ano = ano;
		this.valor = valor;
		this.modelo = modelo;
		this.acessorios = acessorios;
	}
	public Veiculo() {
		super();
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Acessorio[] getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(Acessorio[] acessorios) {
		this.acessorios = acessorios;
	}

}
