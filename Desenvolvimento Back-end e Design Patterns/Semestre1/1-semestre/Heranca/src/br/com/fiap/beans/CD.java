package br.com.fiap.beans;

public class CD extends Produto {
 private int totalFaixas;
 private boolean lancamento;
 private String artista;
 
 
 public CD(String descricao, double valor, int codigo, int totalFaixas, boolean lancamento, String artista) {
	super(descricao, valor, codigo);
	this.totalFaixas = totalFaixas;
	this.lancamento = lancamento;
	this.artista = artista;
}

public CD(){
	super(); 
 }
 
 public int getTotalFaixas() {
	return totalFaixas;
 }
 public void setTotalFaixas(int totalFaixas) {
	this.totalFaixas = totalFaixas;
 }
 public boolean isLancamento() {
	return lancamento;
 }
 public void setLancamento(boolean lancamento) {
	this.lancamento = lancamento;
 }
 public String getArtista() {
	return artista;
 }
 public void setArtista(String artista) {
	this.artista = artista;
 } 
 public String getTudo(){
	 return totalFaixas + "\n" + lancamento + "\n" + artista + "\n" + super.getTudo();
 }
}
