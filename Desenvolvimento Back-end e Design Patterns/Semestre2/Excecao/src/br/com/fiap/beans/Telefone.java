package br.com.fiap.beans;

public class Telefone {
	private short ddd;
	private int numero;
	private String operadora;
	private long codigo;

	public short getDdd() {
		return ddd;
	}
	public void setDdd(short ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Telefone() {
		super();
	}
	public Telefone(short ddd, int numero, String operadora, long codigo) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
		this.codigo = codigo;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getTelefone(){
		return "(" + ddd + ") " + numero;
	}


}
