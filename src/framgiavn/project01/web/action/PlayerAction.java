package framgiavn.project01.web.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.PlayerBusiness;
import framgiavn.project01.web.info.PlayerInfo;

public class PlayerAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(PlayerAction.class);
	private PlayerBusiness playerBusiness;
	private PlayerInfo playerBean;
	private List<PlayerInfo> players;
	private List<String> skillList;
	private List<String> positionList;
	private String skills;
	private String positions;
	
//	public PlayerAction() {
//		skillList = new ArrayList<String>();
//		positionList = new ArrayList<String>();
//		skillList.add("Marseille Turn");
//		skillList.add("Sombero");
//		skillList.add("Cut Behind & Turn");
//		skillList.add("Long Range Drive");
//		skillList.add("Acrobatic Finishing");
//		skillList.add("First-time Shot");
//		skillList.add("One-touch Pass");
//		skillList.add("Pinpoint Crossing");
//		skillList.add("Low Lofted Pass");
//		skillList.add("Malicia");
//		skillList.add("Scissors Feint");
//		skillList.add("Flip Flap");
//		skillList.add("Scotch Move");
//		skillList.add("Heading");
//		skillList.add("Knuckle Shot");
//		skillList.add("Heel Trick");
//		skillList.add("Weighted Pass");
//		skillList.add("Outside Curler");
//		skillList.add("Rabona");
//		skillList.add("Low Punt Trajectory");
//		skillList.add("Long Throw");
//		skillList.add("GK Long Throw");
//		skillList.add("Malicia");
//		skillList.add("Man Marking");
//		skillList.add("Track Back");
//		skillList.add("Acrobatic Clear");
//		skillList.add("Captaincy");
//		skillList.add("Super-sub");
//		skillList.add("Fighting Spirit");
//		
//		positionList.add("GK");
//		positionList.add("CB");
//		positionList.add("LB");
//		positionList.add("RB");
//		positionList.add("DMF");
//		positionList.add("CMF");
//		positionList.add("RMF");
//		positionList.add("LMF");
//		positionList.add("AMF");
//		positionList.add("RWF");
//		positionList.add("LWF");
//		positionList.add("SS");
//		positionList.add("CF");
//	}
	
	public List<String> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

	public List<String> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<String> positionList) {
		this.positionList = positionList;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getPositions() {
		return positions;
	}

	public void setPositions(String positions) {
		this.positions = positions;
	}

	public PlayerBusiness getPlayerBusiness() {
		return playerBusiness;
	}

	public void setPlayerBusiness(PlayerBusiness playerBusiness) {
		this.playerBusiness = playerBusiness;
	}

	public PlayerInfo getPlayerBean() {
		return playerBean;
	}

	public void setPlayerBean(PlayerInfo playerBean) {
		this.playerBean = playerBean;
	}

	public List<PlayerInfo> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerInfo> players) {
		this.players = players;
	}

	public String addPlayer() {
		playerBean.setSkills(toSet(skills));
		playerBean.setPositions(toSet(positions));
		playerBusiness.addPlayer(playerBean);
		return SUCCESS;
	}
	
	public String findPlayerByName() {
		players = playerBusiness.findPlayerByName(playerBean.getName());
		return SUCCESS;
	}
	
	public String findPlayerByNation() {
		players = playerBusiness.findPlayerByNation(playerBean.getNationality());
		return SUCCESS;
	}
	
	public String findPlayerByRegion() {
		players = playerBusiness.findPlayerByRegion(playerBean.getRegion());
		return SUCCESS;
	}
	
	public String showAllPlayer() {
		return SUCCESS;
	}
	
	public String initializeList() {
		skillList = new ArrayList<String>();
		positionList = new ArrayList<String>();
		skillList.add("Marseille Turn");
		skillList.add("Sombero");
		skillList.add("Cut Behind & Turn");
		skillList.add("Long Range Drive");
		skillList.add("Acrobatic Finishing");
		skillList.add("First-time Shot");
		skillList.add("One-touch Pass");
		skillList.add("Pinpoint Crossing");
		skillList.add("Low Lofted Pass");
		skillList.add("Malicia");
		skillList.add("Scissors Feint");
		skillList.add("Flip Flap");
		skillList.add("Scotch Move");
		skillList.add("Heading");
		skillList.add("Knuckle Shot");
		skillList.add("Heel Trick");
		skillList.add("Weighted Pass");
		skillList.add("Outside Curler");
		skillList.add("Rabona");
		skillList.add("Low Punt Trajectory");
		skillList.add("Long Throw");
		skillList.add("GK Long Throw");
		skillList.add("Man Marking");
		skillList.add("Track Back");
		skillList.add("Acrobatic Clear");
		skillList.add("Captaincy");
		skillList.add("Super-sub");
		skillList.add("Fighting Spirit");
		
		positionList.add("GK");
		positionList.add("CB");
		positionList.add("LB");
		positionList.add("RB");
		positionList.add("DMF");
		positionList.add("CMF");
		positionList.add("RMF");
		positionList.add("LMF");
		positionList.add("AMF");
		positionList.add("RWF");
		positionList.add("LWF");
		positionList.add("SS");
		positionList.add("CF");
		
		log.info(skillList);
		log.info(positionList);
		return NONE;
	}

	public Set toSet(String s) {
		String[] tmp = s.split(",");
		Set<String> result = new HashSet<String>();
		for (String string : tmp) {
			log.info(string.trim());
			result.add(string.trim());
		}
		return result;
	}
	
}
