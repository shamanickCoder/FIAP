package br.com.fiap.beans;

public class Aluno {
 private String rm;
 private String nome;
 private String email;
 private String cpf;
 private double mensalidade;
 private char sexo;
 
 public Aluno(){
	 
 }
 public Aluno(String rm2, String nome2, String email2, String cpf2, double mensalidade2, char sexo2){
	 rm = rm2;
	 nome = validarNome(nome2);
	 email = validarEmail(email2);
	 cpf = validarCpf(cpf2);
	 validarMensalidade(mensalidade2);
	 validarSexo(sexo2);
 }
 public String getRm() {
	return rm;
 }
 public void setRm(String rm) {
	this.rm = rm;
 }
 public String getNome() {
	return nome;
 }
 public void setNome(String nome) {
	this.nome = validarNome(nome);
 }
 public String getEmail() {
	return email;
 }
 public void setEmail(String email) {
	this.email = validarEmail(email);
 }
 public String getCpf() {
	return cpf;
 }
 public void setCpf(String cpf) {
	this.cpf = validarCpf(cpf);
 }
 public double getMensalidade() {
	return mensalidade;
 }
 public void setMensalidade(double mensalidade) {
	validarMensalidade(mensalidade);
 }
 public char getSexo() {
	return sexo;
 }
 public void setSexo(char sexo) {
	validarSexo(sexo);
 }
 public String validarCpf(String x){
	 if(x.length() == 14)
	  return x;
	 else 
		 return "CPF inválido";
 }
 public String validarNome(String x){
	 if(x.length() > 2)
		  return x;
	 else 
		 return "Sem nome";
 }
 public String validarEmail(String x){
     if(x.indexOf('@') >= 1)
    	 return x;
     else
    	 return "Email inválido.";
 }
 public void validarMensalidade(double x){
	 if(x >= 0){
		 mensalidade = x;		 
	 }	 
 }
 public void validarSexo(char x){
	 if(x == 'M' || x == 'm'){
		 sexo = 'M';		 
	 }
	 else {
		 sexo = 'F';		 
	 }
 }
}