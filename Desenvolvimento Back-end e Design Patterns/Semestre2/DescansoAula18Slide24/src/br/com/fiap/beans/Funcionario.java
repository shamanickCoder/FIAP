package br.com.fiap.beans;

public class Funcionario {
 private String nome;
 private double salario;
 private int falta;
 private String cargo;
 
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public int getFalta() {
	return falta;
}

public void setFalta(int falta) {
	this.falta = falta;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public Funcionario() {
	super();
}

public Funcionario(String nome, double salario, int falta, String cargo) {
	super();
	this.nome = nome;
	this.salario = salario;
	this.falta = falta;
	this.cargo = cargo;
}
 
 public String getTudo(){
	 return "Nome: " + nome + "\nSalário: " + salario + "\nFaltas: " + falta + "\nCargo: " + cargo;
 }
}
