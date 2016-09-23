package br.com.fiap.beans;

public class Medico extends PFisica{
 private int crm;
 private int codigo;
 
 
 
public Medico() {
	super();
}
public Medico(String rg, String cpf, int crm, int codigo) {
	super(rg, cpf);
	this.crm = crm;
	this.codigo = codigo;
}
public int getCrm() {
	return crm;
}
public void setCrm(int crm) {
	this.crm = crm;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
 
 
}
