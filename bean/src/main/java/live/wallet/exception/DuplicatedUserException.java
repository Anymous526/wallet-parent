package live.wallet.exception;

public class DuplicatedUserException extends UserManagerException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2596115470166248823L;

	public DuplicatedUserException() {
		super();
	}

	public DuplicatedUserException(String message) {
		super(message);
	}

	public DuplicatedUserException(Throwable cause) {
		super(cause);
	}

	public DuplicatedUserException(String message, Throwable cause) {
		super(message, cause);
	}
}
