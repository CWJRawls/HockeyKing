package com.rawls.data;

import java.awt.Color;

public class Team {

	private Coach c; //The current coach
	private Player[] roster; //Array of players on the roster
	private String city; //The String of the city the team plays from
	private String mascot; //What is the mascot for the team
	private String abrev; //What to use for abbreviation on scoreboards
	private Color[] colors; //The colors for the team Primary/Secondary/Trim
	private int[][] history; //The statistical History of the team
	private int[] season_record; //The records for the current season.
	
	//Constructor for team, only constructor available
	public Team(String[] team_info, int[] s_r, Coach co, Player[] r, Color[] cs)
	{
		
	}
}
