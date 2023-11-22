package excecoes;

public class AtualizarExcecao extends RuntimeException {
	//evita problemas com diferentes versões da classe.
	private static final long serialVersionUID = 1L;

	public AtualizarExcecao(String msg) {
		super(msg);
	}
}