package excecoes;

public class AtualizarExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AtualizarExcecao(String msg) {
		super(msg);
	}
}