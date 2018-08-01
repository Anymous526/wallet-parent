package live.wallet.model;

import java.io.Serializable;

public class Profile implements  Serializable{

	private static final long serialVersionUID = -3984794356325110599L;
	private int userId;
	private String name;
	private String nickName;
	private String title;

	public Profile(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
