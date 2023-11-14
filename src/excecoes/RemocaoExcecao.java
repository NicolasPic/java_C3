package excecoes;

public class RemocaoExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RemocaoExcecao(String msg) {
		super(msg);
	}
}
