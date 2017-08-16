package framgiavn.project01.web.info;

import framgiavn.project01.web.model.User;

public class UserInfo {
	private int user_id;
	private String username;
	private String password;
	private String email;
	private String avatar;

	private boolean isAdmin;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public UserInfo(User u) {
		setAvatar(u.getAvatar());
		setEmail(u.getEmail());
		setIsAdmin(u.getIsAdmin());
		setPassword(u.getPassword());
		setUser_id(u.getUser_id());
		setUsername(u.getUsername());
	}
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public User toUser() {
		User u = new User();
		u.setAvatar(getAvatar());
		u.setEmail(getEmail());
		u.setIsAdmin(getIsAdmin());
		u.setPassword(getPassword());
		u.setUser_id(getUser_id());
		u.setUsername(getUsername());
		return u;
	}
}
