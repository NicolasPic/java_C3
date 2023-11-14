package excecoes;

public class InsercaoExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InsercaoExcecao(String msg) {
		super(msg);
	}
}