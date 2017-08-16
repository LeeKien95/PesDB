package framgiavn.project01.web.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.info.UserInfo;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(UserAction.class);

	private UserBusiness userBusiness;	
	private UserInfo userBean;
	private List<UserInfo> users;
	
	public List<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}

	public void setUserBusiness(UserBusiness userBusiness) {
		this.userBusiness = userBusiness;
	}

	public void setUserBean(UserInfo userBean) {
		this.userBean = userBean;
	}

	public UserBusiness getUserBusiness() {
		return userBusiness;
	}

	public UserInfo getUserBean() {
		return userBean;
	}

	public String findByUserId() {
		userBean = userBusiness.findByUserId(userBean.getUser_id());
		return SUCCESS;
	}

	public String findByUsername() {
		userBean = userBusiness.findByUsername(userBean.getUsername());
		return SUCCESS;
	}
	
	public String addUser() {
		UserInfo userInfo = userBusiness.addUser(userBean);
		if(userInfo != null) return SUCCESS;
		else return ERROR;
	}
	
	public String showUsers() {
		users = userBusiness.showUsers();
		return SUCCESS;
	}

	public String homePage() {
		log.info("#####################################");
		return SUCCESS;
	}

}