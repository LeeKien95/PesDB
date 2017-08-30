package framgiavn.project01.web.info;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import framgiavn.project01.web.model.Ability;
import framgiavn.project01.web.model.Player;

public class PositionInfo {
	public int position_id;
	public String name;
	public PositionInfo() {
		
	}
	public PositionInfo(int position_id, String name) {
		super();
		this.position_id = position_id;
		this.name = name;
	}
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}