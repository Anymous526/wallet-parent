package live.wallet.model;

public class User {
	private int id;
	private String userName;
	private String passwd;
	private Profile prfiles = new Profile(this.id);
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
}
