package framgiavn.project01.web.business.impl;

import java.util.ArrayList;
import java.util.List;

import framgiavn.project01.web.business.PlayerBusiness;
import framgiavn.project01.web.dao.PlayerDAO;
import framgiavn.project01.web.info.PlayerInfo;
import framgiavn.project01.web.model.Player;

public class PlayerBusinessImpl implements PlayerBusiness {
	
	public PlayerDAO playerDAO;
	
	public PlayerDAO getPlayerDAO() {
		return playerDAO;
	}

	public void setPlayerDAO(PlayerDAO playerDAO) {
		this.playerDAO = playerDAO;
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

	public void addPlayer(PlayerInfo p) {
		try {
			playerDAO.addPlayer(p.toPlayer());
		} catch (Exception e) {
			e.printStackTrace();
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
