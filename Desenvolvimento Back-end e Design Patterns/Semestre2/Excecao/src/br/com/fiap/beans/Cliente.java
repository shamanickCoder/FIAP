package br.com.fiap.beans;

import java.util.List;

import br.com.fiap.excecoes.Excecoes;

public class Cliente {
	private String nome;
	private byte qtdeEstrelas;
	private long codigo;
	private List<Telefone> tels;

	/*public Cliente(String nome, byte qtdeEstrelas, long codigo, List<Telefone> tels) {
	super();
	this.nome = nome;
	this.qtdeEstrelas = qtdeEstrelas;
	this.codigo = codigo;
	this.tels = tels;
}*/
	public Cliente(String nome, byte qtdeEstrelas, long codigo, List<Telefone> tels) throws Excecoes{
		super();
		this.setNome(nome);
		this.setQtdeEstrelas(qtdeEstrelas);
		this.setCodigo(codigo);
		this.setTels(tels);
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getQtdeEstrelas() {
		return qtdeEstrelas;
	}

	public void setQtdeEstrelas(byte qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public List<Telefone> getTels(){
		return tels;
	}
	public void setTels(List<Telefone> tels){
		this.tels = tels;
	}


}
