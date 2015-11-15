package com.rawls.data;

import java.awt.Color;

public abstract class Team {

	protected Coach c; //The current coach
	protected Player[] roster; //Array of players on the roster
	protected String city; //The String of the city the team plays from
	protected String mascot; //What is the mascot for the team
	protected String abrev; //What to use for abbreviation on scoreboards
	protected Color[] colors; //The colors for the team Primary/Secondary/Trim
	protected int[][] history; //The statistical History of the team
	protected int[] season_record; //The records for the current season.
	
	//Constructor for team, only constructor available
	public Team(String[] team_info, int[] s_r, Coach co, Player[] r, Color[] cs)
	{
		
	}
}
