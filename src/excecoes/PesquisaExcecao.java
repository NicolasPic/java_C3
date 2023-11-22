package excecoes;

public class PesquisaExcecao extends RuntimeException {
	//evita problemas com diferentes versões da classe.
	private static final long serialVersionUID = 1L;

	public PesquisaExcecao(String msg) {
		super(msg);
	}
}
