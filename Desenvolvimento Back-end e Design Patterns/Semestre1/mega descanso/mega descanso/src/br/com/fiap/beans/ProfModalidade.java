package br.com.fiap.beans;

public class ProfModalidade {
 private PFisicaAcademia numMatricula;
 private Modalidade codModalidade;
 private int dtModalidade;
 
 
 
public ProfModalidade() {
	super();
}
public ProfModalidade(PFisicaAcademia numMatricula, Modalidade codModalidade, int dtModalidade) {
	super();
	this.numMatricula = numMatricula;
	this.codModalidade = codModalidade;
	this.dtModalidade = dtModalidade;
}
public PFisicaAcademia getNumMatricula() {
	return numMatricula;
}
public void setNumMatricula(PFisicaAcademia numMatricula) {
	this.numMatricula = numMatricula;
}
public Modalidade getCodModalidade() {
	return codModalidade;
}
public void setCodModalidade(Modalidade codModalidade) {
	this.codModalidade = codModalidade;
}
public int getDtModalidade() {
	return dtModalidade;
}
public void setDtModalidade(int dtModalidade) {
	this.dtModalidade = dtModalidade;
}
 
 
}
