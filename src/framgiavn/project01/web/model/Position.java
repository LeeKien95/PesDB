package framgiavn.project01.web.model;

import java.util.List;

public class Position {
	private Integer position_id;
	public String name;
	private List<Player> players;
	
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public Integer getPosition_id() {
		return position_id;
	}
	public void setPosition_id(Integer position_id) {
		this.position_id = position_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
