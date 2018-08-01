package live.wallet.model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -7713330163761509606L;
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
