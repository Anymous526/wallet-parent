package live.wallet.exception;

public class UserManagerException extends RuntimeException {

	private static final long serialVersionUID = 5452791509846613181L;

	public UserManagerException() {
		super();
	}

	public UserManagerException(String message) {
		super(message);
	}

	public UserManagerException(Throwable cause) {
		super(cause);
	}

	public UserManagerException(String message, Throwable cause) {
		super(message, cause);
	}
}
