package entidades;

public abstract class Produto {

	private String marca;
	private double preco;
	private int quantidade;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//cria um objeto vazio
	public Produto() {
		marca = " ";
		preco = 0;
		quantidade = 0;
		modelo = " ";
	}
	public Produto(String nome, double preco, int quantidade, String modelo) {
		this.marca = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.modelo = modelo;
	}
	
	
	public abstract String toString();
}
