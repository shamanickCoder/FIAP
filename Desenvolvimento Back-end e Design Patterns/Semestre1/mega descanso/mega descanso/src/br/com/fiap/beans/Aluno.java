package br.com.fiap.beans;

public class Aluno extends PFisicaAcademia{
 private PJuridica codInstituicao;
 private String dtMatricula;
 
 
public Aluno() {
	super();
}
public Aluno(int numeroMatricula, String dtNascimento, char sexo, PJuridica instituicao, String dtMatricula) {
	super(numeroMatricula, dtNascimento, sexo);
	this.codInstituicao = instituicao;
	this.dtMatricula = dtMatricula;
}
public PJuridica getInstituicao() {
	return codInstituicao;
}
public void setInstituicao(PJuridica instituicao) {
	this.codInstituicao = instituicao;
}
public String getDtMatricula() {
	return dtMatricula;
}
public void setDtMatricula(String dtMatricula) {
	this.dtMatricula = dtMatricula;
}
 
 
}
