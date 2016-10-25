package br.com.fiap.beans;

import java.io.Serializable;
import java.util.Calendar;

public class Funcionario implements Serializable{
	private String nome;
	private int codigo;
	private Cargo cargo;
	private Calendar dtAdmissao;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Calendar getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Calendar dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public Funcionario(String nome, int codigo, Cargo cargo, Calendar dtAdmissao) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.cargo = cargo;
		this.dtAdmissao = dtAdmissao;
	}
	public Funcionario() {
		super();
	}



}
