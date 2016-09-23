package br.com.fiap.modelo;

public class Boletim {
      private Aluno aluno;
      private double nota1;
      private double nota2;
      private int faltas;
      
      public void setAluno(Aluno aluno){
    	  this.aluno = aluno;
      }
      public void setNota1(double nota1){
    	  this.nota1 = nota1;
      }
      public void setNota2(double nota2){
    	  this.nota2 = nota2;
      }
      public void setFaltas(int faltas){
    	  this.faltas = faltas;
      }
      public Aluno getAluno(){
    	  return aluno;
      }
      public double getNota1(){
    	  return nota1;
      }
      public double getNota2(){
    	  return nota2;
      }
      public int getFaltas(){
    	  return faltas;
      }
      public double exibirMedia(double n1, double n2){
    	  return ((n1+n2)/2);
      }
	public Boletim(Aluno aluno, double nota1, double nota2, int faltas) {
		super();
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.faltas = faltas;
	}
	public Boletim(){
		
	}
}
