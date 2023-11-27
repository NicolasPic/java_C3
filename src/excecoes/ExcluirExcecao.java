package excecoes;

public class ExcluirExcecao extends RuntimeException{
	//evita problemas com diferentes versões da classe.
		private static final long serialVersionUID = 1L;

		public ExcluirExcecao(String msg) {
			super(msg);
		}
}
