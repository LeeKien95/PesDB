package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Player;

public interface PlayerDAO {
	public Player findById(int id);
	public List<Player> findByName(String name);
	public List<Player> findByNation(String nation);
	public List<Player> findByRegion(String region);
	public void addPlayer(Player p);
	public void updatePlayer(int id, Player newPlayer);
	public void deletePlayer(int id);
}
