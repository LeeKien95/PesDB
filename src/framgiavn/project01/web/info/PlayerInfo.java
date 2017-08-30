package framgiavn.project01.web.info;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import framgiavn.project01.web.model.Ability;
import framgiavn.project01.web.model.Player;

public class PlayerInfo {
	public int id;
	public String name;
	public int age;
	public String nationality;
	public String region;
	public int height;
	public int weight;
	public int strongFoot;
	public List<Integer> positions;
	public Set<String> skills;
	public Ability ability;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStrongFoot() {
		return strongFoot;
	}
	public void setStrongFoot(int strongFoot) {
		this.strongFoot = strongFoot;
	}
	public List<Integer> getPositions() {
		return positions;
	}
	public void setPositions(List<Integer> position) {
		this.positions = position;
	}
	public Ability getAbility() {
		return ability;
	}
	public void setAbilities(Ability map) {
		this.ability = map;
	}
	
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	
	public PlayerInfo() {
		
	}
	
	public PlayerInfo(Player p) {
		setId(p.getPlayer_id());
		setAbilities(p.getAbility());
		setAge(p.getAge());
		setHeight(p.getHeight());
		setName(p.getName());
		setNationality(p.getNationality());
//		setPositions(p.getPositions());
		setRegion(p.getRegion());
		setStrongFoot(p.getStrongFoot());
		setWeight(p.getWeight());
		setSkills(p.getSkills());
	}
	
	public Player toPlayer() {
		Player p = new Player();
//		p.setPlayer_id(getId());
		p.setAbility(getAbility());
		p.setAge(getAge());
		p.setHeight(getHeight());
		p.setName(getName());
		p.setSkills(getSkills());
		p.setNationality(getNationality());
//		p.setPositions(getPositions());
		p.setRegion(getRegion());
		p.setStrongFoot(getStrongFoot());
		p.setWeight(getWeight());
		return p;
	}
	
}