package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.info.UserInfo;

public interface UserBusiness {
	public UserInfo findByUserId(Integer user_id);

	public UserInfo findByUsername(String username);
	
	public UserInfo addUser(UserInfo user);
	
	public List<UserInfo> showUsers();
}