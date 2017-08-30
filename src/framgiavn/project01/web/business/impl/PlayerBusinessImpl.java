package framgiavn.project01.web.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import framgiavn.project01.web.business.PlayerBusiness;
import framgiavn.project01.web.dao.PlayerDAO;
import framgiavn.project01.web.dao.PlayerPositionDAO;
import framgiavn.project01.web.dao.PositionDAO;
import framgiavn.project01.web.info.PlayerInfo;
import framgiavn.project01.web.model.Player;
import framgiavn.project01.web.model.PlayerPosition;
import framgiavn.project01.web.model.Position;

public class PlayerBusinessImpl implements PlayerBusiness {

	private PlayerDAO playerDAO;
	private PlayerPositionDAO playerPositionDAO;

	private static final Logger log = Logger.getLogger(PlayerBusinessImpl.class);

	public PlayerDAO getPlayerDAO() {
		return playerDAO;
	}

	public void setPlayerDAO(PlayerDAO playerDAO) {
		this.playerDAO = playerDAO;
	}


	public PlayerPositionDAO getPlayerPositionDAO() {
		return playerPositionDAO;
	}

	public void setPlayerPositionDAO(PlayerPositionDAO playerPositionDAO) {
		this.playerPositionDAO = playerPositionDAO;
	}

	public List<PlayerInfo> findPlayerByName(String name) {
		try {
			List<Player> players = playerDAO.findByName(name);
			List<PlayerInfo> pInfo = new ArrayList<PlayerInfo>();
			for (Player player : players) {
				pInfo.add(new PlayerInfo(player));
			}
			return pInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<PlayerInfo> findPlayerByNation(String nation) {
		try {
			List<Player> players = playerDAO.findByNation(nation);
			List<PlayerInfo> pInfo = new ArrayList<PlayerInfo>();
			for (Player player : players) {
				pInfo.add(new PlayerInfo(player));
			}
			return pInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<PlayerInfo> findPlayerByRegion(String region) {
		try {
			List<Player> players = playerDAO.findByRegion(region);
			List<PlayerInfo> pInfo = new ArrayList<PlayerInfo>();
			for (Player player : players) {
				pInfo.add(new PlayerInfo(player));
			}
			return pInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addPlayer(PlayerInfo playerInfo) {
		try {
			Player player = playerInfo.toPlayer();
			playerDAO.addPlayer(player);
			for (Integer id : playerInfo.getPositions()) {
				PlayerPosition playerPosition = new PlayerPosition();
				playerPosition.setPosition_id(id);
				playerPosition.setPlayer_id(player.getPlayer_id());
				playerPositionDAO.save(playerPosition);
			}
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public void updatePlayer(PlayerInfo p) {
		try {
			playerDAO.updatePlayer(p.getId(), p.toPlayer());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void deletePlayer(int id) {
		try {
			playerDAO.deletePlayer(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
