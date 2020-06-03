package jp.co.aforce.beans;

public class Login_bean {

	private String username;
	private String password;
	private String emsg;
	public Login_bean(){};

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmsg() {
		return emsg;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmsg(String emsg) {
		this.emsg = emsg;

	}

}