package excecoes;

public class PesquisaExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PesquisaExcecao(String msg) {
		super(msg);
	}
}
