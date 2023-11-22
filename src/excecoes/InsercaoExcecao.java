package excecoes;

public class InsercaoExcecao extends RuntimeException {
	//evita problemas com diferentes versões da classe.
	private static final long serialVersionUID = 1L;

	public InsercaoExcecao(String msg) {
		super(msg);
	}
}