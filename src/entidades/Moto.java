package entidades;

public class Moto extends Produto{

	private int cc;
	//cria um objeto vazio
	public Moto() {
		super();
		cc = 0;
	}

	public Moto(String marca, double preco, int quantidade, String modelo, int cc) {
		super(marca, preco, quantidade, modelo);
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Moto," + getMarca() + ","+ getPreco() + ","+ getQuantidade() + ","+ getModelo() + "," + getCc() ;
		
	}
	
	
	
}
