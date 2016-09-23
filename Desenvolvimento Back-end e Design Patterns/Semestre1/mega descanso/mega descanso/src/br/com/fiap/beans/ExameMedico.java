package br.com.fiap.beans;

public class ExameMedico {
 private int codigo;
 private Aluno matricula;
 private Medico codMed;
 private int dataAvaliacao;
 private int valorPressao;
 private int qtBatimentos;
 private double altura;
 private double peso;
 private String obs;
 
 
 
public ExameMedico() {
	super();
}
public ExameMedico(int codigo, Aluno matricula, Medico codMed, int dataAvaliacao, int valorPressao, int qtBatimentos,
		double altura, double peso, String obs) {
	super();
	this.codigo = codigo;
	this.matricula = matricula;
	this.codMed = codMed;
	this.dataAvaliacao = dataAvaliacao;
	this.valorPressao = valorPressao;
	this.qtBatimentos = qtBatimentos;
	this.altura = altura;
	this.peso = peso;
	this.obs = obs;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public Aluno getMatricula() {
	return matricula;
}
public void setMatricula(Aluno matricula) {
	this.matricula = matricula;
}
public Medico getCodMed() {
	return codMed;
}
public void setCodMed(Medico codMed) {
	this.codMed = codMed;
}
public int getDataAvaliacao() {
	return dataAvaliacao;
}
public void setDataAvaliacao(int dataAvaliacao) {
	this.dataAvaliacao = dataAvaliacao;
}
public int getValorPressao() {
	return valorPressao;
}
public void setValorPressao(int valorPressao) {
	this.valorPressao = valorPressao;
}
public int getQtBatimentos() {
	return qtBatimentos;
}
public void setQtBatimentos(int qtBatimentos) {
	this.qtBatimentos = qtBatimentos;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public String getObs() {
	return obs;
}
public void setObs(String obs) {
	this.obs = obs;
}
 
 
}
