package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.info.PlayerInfo;

public interface PlayerBusiness {
	public List<PlayerInfo> findPlayerByName(String name);
	public List<PlayerInfo> findPlayerByNation(String nation);
	public List<PlayerInfo> findPlayerByRegion(String region);
	public void addPlayer(PlayerInfo p);
	public void updatePlayer(PlayerInfo p);
	public void deletePlayer(int id);
}
