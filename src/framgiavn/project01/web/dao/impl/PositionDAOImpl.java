package framgiavn.project01.web.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.PositionDAO;
import framgiavn.project01.web.model.Position;

public class PositionDAOImpl extends HibernateDaoSupport implements PositionDAO {

	private static final Logger log = Logger.getLogger(PositionDAOImpl.class);

	@Override
	public void save(Position position) {
		getHibernateTemplate().save(position);
	}

}
