package Exception;

public class MovimentoInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public MovimentoInvalidoException(String mensagem) {
		super(mensagem);
	}
}