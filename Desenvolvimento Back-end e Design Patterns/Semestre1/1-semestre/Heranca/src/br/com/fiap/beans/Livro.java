package br.com.fiap.beans;

public class Livro extends Produto {
 private int totalPaginas;
 private String autor;
 private String editora;
 
 public Livro(){
	 super();
 }
 public Livro(int totalPaginas, String autor, String editora, String d, double v, int c){
	 super(d, v, c);
	 /*super.setDescricao(d);
	 super.setValor(v);
	 super.setCodigo(c);*/
	 this.totalPaginas = totalPaginas;
	 this.autor = autor;
	 this.editora = editora;
 }
 public int getTotalPaginas() {
	return totalPaginas;
 }
 public void setTotalPaginas(int totalPaginas) {
	this.totalPaginas = totalPaginas;
 }
 public String getAutor() {
	return autor;
 }
 public void setAutor(String autor) {
	this.autor = autor;
 }
 public String getEditora() {
	return editora;
 }
 public void setEditora(String editora) {
	this.editora = editora;
 }
 public String getTudo(){
	 return totalPaginas + "\n" + autor + "\n" + editora + "\n" + super.getTudo();
 }
}
