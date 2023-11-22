package entidades;

public class Carro extends Produto{

	private String tamanho;

	public Carro(String marca, double preco, int quantidade, String modelo, String tamanho) {
		super(marca, preco, quantidade, modelo);
		this.tamanho = tamanho;
	}
	//cria um objeto vazio
	public Carro() {
		super();
		tamanho = " ";
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Carro," + getMarca() + ","+ getPreco() + ","+ getQuantidade() + ","+ getModelo() + "," + getTamanho() ;
	}

	
}
