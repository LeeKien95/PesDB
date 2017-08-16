package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserDAO {
	public User findByUserId(Integer user_id);

	public User findByUsername(String username);
	
	public void addUser(User user);
	
	public List<User> showUsers();
}