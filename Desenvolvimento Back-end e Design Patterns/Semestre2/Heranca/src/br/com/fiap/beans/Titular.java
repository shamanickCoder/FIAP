package br.com.fiap.beans;

public class Titular {
 private String nome;
 private String cpf;
 
 
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

public Titular() {
	super();
}

public Titular(String nome, String cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
 
 
}
