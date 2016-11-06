package br.com.fiap.beans;

public class Titular {
	private String nome = new String();
	private String cpf = new String();

	public Titular() {
		super();
	}

	public Titular(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
