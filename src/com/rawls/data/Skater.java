package com.rawls.data;

public class Skater extends Player{

	String pos;
	
	/**
	 * 
	 * @param f first name of player
	 * @param l last name of player
	 * @param p play style of skater (tied to ai loading)
	 * 
	 * @param attributes Array of data about the skater's abilities.
	 *  
	 * UTILITY
	 * @param Speed - How far the player will move in a turn
	 * @param Dexterity - Ability of the skater to corral loose pucks
	 * @param Balance - How well the skater can stay on their feet.
	 * @param Injury_Resistance - How likely the skater is to be injured
	 * @param Hand_eye - Ability of the player to knock pucks down or tip shots
	 * @param Stamina - How long the skater can move at full speed
	 * 
	 * OFFENSIVE
	 * @param Posession - Difficulty for player to be stick checked
	 * @param Passing - Likelihood Pass will be on target
	 * @param Wrist_Shot_Power - How fast the puck is moving when shot
	 * @param Wrist_Shot_accuracy - How accurate the skater is on the wrist shot
	 * @param Slap_shot_power - How fast the puck is moving when shot
	 * @param Slap_shot_accuracy How accurate the skater is on the slap shot
	 * 
	 * DEFENSIVE
	 * @param Body_Checking - Chance body check will be successful
	 * @param Stick_Checking - Chance Stick Check will be successful
	 * @param Shot_Blocking - Chance a shot block will be successful
	 * @param Toughness - How many hits the skater will take in a game before shying away from contact
	 */
	
	public Skater(String f, String l, String p) {
		super(f, l, p);
		
		//Initialize Attributes Matrix here.
	}

	@Override
	public int[] getSeasonStats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getCareerStats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStatType(int type, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[][] getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void calculateAttrChange() {
		// TODO Auto-generated method stub
		
	}

}
