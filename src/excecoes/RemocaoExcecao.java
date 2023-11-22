package excecoes;

public class RemocaoExcecao extends RuntimeException {
	//evita problemas com diferentes versões da classe.
	private static final long serialVersionUID = 1L;

	public RemocaoExcecao(String msg) {
		super(msg);
	}
}
