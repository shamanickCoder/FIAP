package br.com.fiap.beans;

public class Aula {
 private int seqAula;
 private Modalidade codModalidade;
 private Sala numSala;
 private int nivelDificulta;
 private int dtHorarioInicio;
 private int numTempoDuracao;
 
 
 
public Aula() {
	super();
}
public Aula(int seqAula, Modalidade codModalidade, Sala numSala, int nivelDificulta, int dtHorarioInicio,
		int numTempoDuracao) {
	super();
	this.seqAula = seqAula;
	this.codModalidade = codModalidade;
	this.numSala = numSala;
	this.nivelDificulta = nivelDificulta;
	this.dtHorarioInicio = dtHorarioInicio;
	this.numTempoDuracao = numTempoDuracao;
}
public int getSeqAula() {
	return seqAula;
}
public void setSeqAula(int seqAula) {
	this.seqAula = seqAula;
}
public Modalidade getCodModalidade() {
	return codModalidade;
}
public void setCodModalidade(Modalidade codModalidade) {
	this.codModalidade = codModalidade;
}
public Sala getNumSala() {
	return numSala;
}
public void setNumSala(Sala numSala) {
	this.numSala = numSala;
}
public int getNivelDificulta() {
	return nivelDificulta;
}
public void setNivelDificulta(int nivelDificulta) {
	this.nivelDificulta = nivelDificulta;
}
public int getDtHorarioInicio() {
	return dtHorarioInicio;
}
public void setDtHorarioInicio(int dtHorarioInicio) {
	this.dtHorarioInicio = dtHorarioInicio;
}
public int getNumTempoDuracao() {
	return numTempoDuracao;
}
public void setNumTempoDuracao(int numTempoDuracao) {
	this.numTempoDuracao = numTempoDuracao;
}
 
 
}
