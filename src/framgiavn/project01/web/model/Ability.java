package framgiavn.project01.web.model;

import org.apache.catalina.startup.SetAllPropertiesRule;

public class Ability {
	private int player_id;
	public Player player;
	public int attackingProwess, ballControl, dribbling, lowPass, loftedPass,
	finishing, placeKicking, swerve, header, defensiveProwess, ballWinning, kickingPower, speed, explosivePower, bodyControl,
	physicalContact, jump, stamina, goalkeeping, catching, clearing, reflexes, coverage, form, injuryResistance, weakFootUsage,
	weakFootAccuracy, overallRating;
	
	public Ability() {
		setAttackingProwess(40);
		setBallControl(40);
		setBallWinning(40);
		setBodyControl(40);
		setCatching(40);
		setClearing(40);
		setCoverage(40);
		setDefensiveProwess(40);
		setDribbling(40);
		setExplosivePower(40);
		setFinishing(40);
		setForm(40);
		setGoalkeeping(40);
		setHeader(40);
		setInjuryResistance(3);
		setJump(40);
		setKickingPower(40);
		setLoftedPass(40);
		setLowPass(40);
		setOverallRating(45);
		setPhysicalContact(40);
		setPlaceKicking(40);
		setReflexes(40);
		setSpeed(40);
		setStamina(40);
		setSwerve(40);
		setWeakFootAccuracy(3);
		setWeakFootUsage(3);
	}
	
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getAttackingProwess() {
		return attackingProwess;
	}
	public void setAttackingProwess(int attackingProwess) {
		this.attackingProwess = attackingProwess;
	}
	public int getBallControl() {
		return ballControl;
	}
	public void setBallControl(int ballControl) {
		this.ballControl = ballControl;
	}
	public int getDribbling() {
		return dribbling;
	}
	public void setDribbling(int dribbling) {
		this.dribbling = dribbling;
	}
	public int getLowPass() {
		return lowPass;
	}
	public void setLowPass(int lowPass) {
		this.lowPass = lowPass;
	}
	public int getLoftedPass() {
		return loftedPass;
	}
	public void setLoftedPass(int loftedPass) {
		this.loftedPass = loftedPass;
	}
	public int getFinishing() {
		return finishing;
	}
	public void setFinishing(int finishing) {
		this.finishing = finishing;
	}
	public int getPlaceKicking() {
		return placeKicking;
	}
	public void setPlaceKicking(int placeKicking) {
		this.placeKicking = placeKicking;
	}
	public int getSwerve() {
		return swerve;
	}
	public void setSwerve(int swerve) {
		this.swerve = swerve;
	}
	public int getHeader() {
		return header;
	}
	public void setHeader(int header) {
		this.header = header;
	}
	public int getDefensiveProwess() {
		return defensiveProwess;
	}
	public void setDefensiveProwess(int defensiveProwess) {
		this.defensiveProwess = defensiveProwess;
	}
	public int getBallWinning() {
		return ballWinning;
	}
	public void setBallWinning(int ballWinning) {
		this.ballWinning = ballWinning;
	}
	public int getKickingPower() {
		return kickingPower;
	}
	public void setKickingPower(int kickingPower) {
		this.kickingPower = kickingPower;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getExplosivePower() {
		return explosivePower;
	}
	public void setExplosivePower(int explosivePower) {
		this.explosivePower = explosivePower;
	}
	public int getBodyControl() {
		return bodyControl;
	}
	public void setBodyControl(int bodyControl) {
		this.bodyControl = bodyControl;
	}
	public int getPhysicalContact() {
		return physicalContact;
	}
	public void setPhysicalContact(int physicalContact) {
		this.physicalContact = physicalContact;
	}
	public int getJump() {
		return jump;
	}
	public void setJump(int jump) {
		this.jump = jump;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getGoalkeeping() {
		return goalkeeping;
	}
	public void setGoalkeeping(int goalkeeping) {
		this.goalkeeping = goalkeeping;
	}
	public int getCatching() {
		return catching;
	}
	public void setCatching(int catching) {
		this.catching = catching;
	}
	public int getClearing() {
		return clearing;
	}
	public void setClearing(int clearing) {
		this.clearing = clearing;
	}
	public int getReflexes() {
		return reflexes;
	}
	public void setReflexes(int reflexes) {
		this.reflexes = reflexes;
	}
	public int getCoverage() {
		return coverage;
	}
	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	public int getForm() {
		return form;
	}
	public void setForm(int form) {
		this.form = form;
	}
	public int getInjuryResistance() {
		return injuryResistance;
	}
	public void setInjuryResistance(int injuryResistance) {
		this.injuryResistance = injuryResistance;
	}
	public int getWeakFootUsage() {
		return weakFootUsage;
	}
	public void setWeakFootUsage(int weakFootUsage) {
		this.weakFootUsage = weakFootUsage;
	}
	public int getWeakFootAccuracy() {
		return weakFootAccuracy;
	}
	public void setWeakFootAccuracy(int weakFootAccuracy) {
		this.weakFootAccuracy = weakFootAccuracy;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	
}
