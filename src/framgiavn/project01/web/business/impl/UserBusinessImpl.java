package framgiavn.project01.web.business.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.info.UserInfo;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

	public UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}



	@Override
	public UserInfo findByUserId(Integer user_id) {
		try {
			User u = userDAO.findByUserId(user_id);
			return new UserInfo(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserInfo findByUsername(String username) {
		try {
			User u = userDAO.findByUsername(username);
			return new UserInfo(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserInfo addUser(UserInfo user) {
		// TODO Auto-generated method stub
		try {
			userDAO.addUser(user.toUser());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		return user;
	}

	@Override
	public List<UserInfo> showUsers() {
		try {
			List<User> users = userDAO.showUsers();
			List<UserInfo> userInfos = new ArrayList<UserInfo>();
			for(User user : users) {
				userInfos.add(new UserInfo(user));
			}
			return userInfos;
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}