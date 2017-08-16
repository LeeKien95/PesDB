package framgiavn.project01.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.DAOSessionFactory;

public class UserDAOImpl extends DAOSessionFactory implements UserDAO {

	private static final Logger log = Logger.getLogger(UserDAOImpl.class);

	@Override
	public User findByUserId(Integer user_id) {
		return findByUserId(user_id, false);
	}

	public User findByUserId(Integer user_id, boolean lock) {
		try {
			Query query = getSession().getNamedQuery("User.SelectUserByUserId");
			if (lock)
				query.setLockMode("User", LockMode.UPGRADE);
			query.setParameter("user_id", user_id);
			return (User) query.uniqueResult();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		Session session = getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			if(tx!= null) tx.rollback();
			e.printStackTrace();
		} finally {
//			session.close();
		}
	}
	
	public List<User> showUsers() {
		return listUser();
	}
	
	public List<User> listUser(){
		Session session = getSession();
		Transaction tx = null;
		List result = null;
		try {
			tx = session.beginTransaction();
			result = session.createQuery("from User").list();
	        tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
//			session.close();
		}
		return result;
	}

}
