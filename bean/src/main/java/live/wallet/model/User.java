package live.wallet.model;

public class User {
	private int userId;
	private String userName;
	private String passwd;
	private Profile prfiles = new Profile(this.userId);

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Profile getPrfiles() {
		return prfiles;
	}

	public void setPrfiles(Profile prfiles) {
		this.prfiles = prfiles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
