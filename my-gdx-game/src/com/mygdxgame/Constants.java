package com.mygdxgame;

public class Constants {
	
	/* SCREEN SIZE */
	public static final int SIZE_W = 480;
	public static final int SIZE_H = 320;
	
	/* ORIENTATIONS */
	public static final int N_ORIENTATIONS = 2;
	public static final int MAP_ORIENTATIONS = 4;
	public static final int XR = 0;
	public static final int XL = 1;
	public static final int YU = 2;
	public static final int YD = 3;
	
	/* GENERAL */
	public static final int UNDEFINED = -1;
	
	/* BATTLE SIDES */
	public static final int LEFT_SIDE 	= 1;
	public static final int RIGHT_SIDE 	= 2;
	
	/* EVENTS TYPES */
	public static final int NONE 		= -1;
	public static final int SQUARE 		= 0;
	public static final int UNIT 		= 1;
	public static final int SHIELD 		= 2;
	public static final int MAGIC 		= 3;
	public static final int SETTINGS 	= 4;
	
	/* TEXTURES COLORS */
	public static final int N_COLORS = 2;
	public static final int BLUE = 0;
	public static final int RED	 = 1;
	
	/* HUD */
	public static final int HUD_WIDTH = 80;
	public static final int HUD_HEIGHT = Constants.SIZE_H;
	
	/* PLAYERS */
	public static final int NEUTRAL = 0;
	public static final int PLAYER_1 = 1;
	public static final int PLAYER_2 = 2;
	
	/* UNITS */
	public static final int VILLAGER = 0;
	public static final int ARCHER = 1;
	public static final int CRUSADER = 2;
	public static final int KNIGHT = 3;
	public static final int MAGUS = 4;

}
