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
	 * 
	 * OFFENSIVE
	 * @param Posession - Difficulty for player to be stick checked
	 * @param Passing - Likelihood Pass will be on target
	 * 
	 * DEFENSIVE
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
