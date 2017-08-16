package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import framgiavn.project01.web.dao.PlayerDAO;
import framgiavn.project01.web.model.Player;
import framgiavn.project01.web.ulti.DAOSessionFactory;

public class PlayerDAOImpl extends DAOSessionFactory implements PlayerDAO {

	private static final Logger log = Logger.getLogger(PlayerDAOImpl.class);
	
	@Override
	public Player findById(int id) {
		Session session = getSession();
		Criteria crit = session.createCriteria(Player.class)
				.add(Restrictions.idEq(id));
		Player result = (Player)crit.uniqueResult();
		return result;
	}

	@Override
	public List<Player> findByName(String name) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Criteria crit = session.createCriteria(Player.class)
				.add(Restrictions.like("name", "%" + name.toLowerCase() + "%"))
				.setMaxResults(50);
		List result = crit.list();
		return result;
	}

	@Override
	public List<Player> findByNation(String nation) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Criteria crit = session.createCriteria(Player.class)
				.add(Restrictions.eq("nationality", nation.toLowerCase()))
				.addOrder(Order.asc("name"));
		List result = crit.list();
		return result;
	}

	@Override
	public List<Player> findByRegion(String region) {
		Session session = getSession();
		Criteria crit = session.createCriteria(Player.class)
				.add(Restrictions.eq("nationality", region.toLowerCase()))
				.addOrder(Order.asc("name"));
		List result = crit.list();
		return result;
	}

	@Override
	public void addPlayer(Player p) {
		Session session = getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(p);
		} catch (HibernateException e) {
			// TODO: handle exception
			if(tx!= null) tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void updatePlayer(int id, Player newPlayer) {
		Transaction tx = null;
		Session session = getSession();
//		Player oldPlayer = (Player) session.get(Player.class, id);
		try {
			newPlayer.setPlayer_id(id);
			session.update(newPlayer);
			tx.commit();
		} catch (HibernateException e) {
			 if (tx!=null) tx.rollback();
	         e.printStackTrace();
		}
	}

	@Override
	public void deletePlayer(int id) {
		Transaction tx = null;
		Session session = getSession();
//		Player oldPlayer = (Player) session.get(Player.class, id);
		try {
			Player p = (Player) session.get(Player.class, id);
			session.delete(p);
			tx.commit();
		} catch (HibernateException e) {
			 if (tx!=null) tx.rollback();
	         e.printStackTrace();
		}
	}
}
