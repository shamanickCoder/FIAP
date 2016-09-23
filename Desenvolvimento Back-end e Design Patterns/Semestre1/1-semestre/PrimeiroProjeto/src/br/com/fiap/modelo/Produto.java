package br.com.fiap.modelo;

public class Produto {
       private int codigo;
       private String descricao;
       private Fabricante marca;
       private double valor;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Fabricante getMarca() {
		return marca;
	}
	public void setMarca(Fabricante marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}       
    public void setTudo(int cod, String desc, Fabricante marc, double val){
    	codigo = cod;
    	descricao = desc;
    	marca = marc;
    	valor = val;
    }   
    public String getTudo(){
    	return codigo + "\n" + descricao + "\n" + marca.getNome() + "\n" + valor;
    }
    public void setBasico(String desc, int cod){
    	descricao = desc;
    	codigo = cod;
    }
    public String getBasico(){
    	return codigo+"\n"+descricao;
    }
    public String getMarcaDetalhada(){
    	return "A marca é: " + marca.getNome();
    }
    public double getDesconto(){
    	return (0.9)*valor;
    }
    public String getParcelado(){
    	return "Valor do produto: " + valor + "\n" + "3 parcelas de " + (valor/3);
    }
    public void setAtualizar(double porc) {
    	valor = (1 + (porc/100))*valor;
    }
}
