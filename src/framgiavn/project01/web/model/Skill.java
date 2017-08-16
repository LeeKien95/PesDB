package framgiavn.project01.web.model;

import java.util.HashSet;
import java.util.Set;

public class Skill {
	
	private int skill_id;
	private String name;
	private Set<Player> players;

	public int getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
}
