package framgiavn.project01.web.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.PlayerPositionDAO;
import framgiavn.project01.web.model.PlayerPosition;

public class PlayerPositionDAOImpl extends HibernateDaoSupport implements PlayerPositionDAO {

	private static final Logger log = Logger.getLogger(PlayerPositionDAOImpl.class);

	@Override
	public void save(PlayerPosition playerPosition) {
		getHibernateTemplate().save(playerPosition);
	}

}
