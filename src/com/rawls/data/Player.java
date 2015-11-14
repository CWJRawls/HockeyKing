package com.rawls.data;

public abstract class Player {
	
	public static final int NAME_FORMAT_LAST_FIRST = 0;
	public static final int NAME_FORMAT_FIRST_LAST = 1;
	public static final int NAME_FORMAT_LAST_ONLY = 2;
	public static final int NAME_FORMAT_FIRST_ONLY = 3;
	
	private String lName; //last name
	private String fName; //first name
	protected String playStyle; //this should be directly connected to the ai
	
	//The size of these variables will be set in the subclass
	protected int[] seasonStats; //for holding data about the current season
	protected int[] careerStats; //For holding the cumulative stats for a player across their career
	protected int[][] history; //For holding season by season data about the player
	protected int[] attributes; //For holding the current attributes of this player
	
	
	public Player(String f, String l, String p)
	{
		lName = l;
		fName = f;
		playStyle = p;
	}
	
	//Methods to retrieve data about the player
	public abstract int[] getSeasonStats();
	public abstract int[] getCareerStats();
	public abstract int[][] getHistory();
	public abstract int[] getAttributes();
	
	//Method to get name
	public String getName(int format)
	{
		if(format == NAME_FORMAT_LAST_FIRST)
		{
			return lName + ", " + fName;
		}
		else if(format == NAME_FORMAT_FIRST_LAST)
		{
			return fName + " " + lName;
		}
		else if(format == NAME_FORMAT_LAST_ONLY)
		{
			return lName;
		}
		else
		{
			return fName;
		}
	}
	
	//Method to add data to the stats
	public abstract void addStatType(int type, int amount);
	
	//method to be used for calculating attribute changes whenever necessary
	public abstract void calculateAttrChange();
	

}
