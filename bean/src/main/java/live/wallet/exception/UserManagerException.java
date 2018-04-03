package live.wallet.exception;

public class UserManagerException extends RuntimeException {
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
