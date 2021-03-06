package com.races.humands.units;

import com.modules.battle.Arrow;
import com.mygdxgame.Constants;
import com.mygdxgame.Stack;
import com.mygdxgame.Unit;
import com.utils.CallBack;
import com.utils.CustomAnimation;

/**
 * Archer Unit ( distance unit ) 
 */
public class Archer extends Unit {
	
	/* ANIMATIONS */
	public static final String PREPARE = "prepare";
	public static final String SHOOT = "shoot";
	public static final String WALK = "walk";
	
	/* SIZE */
	public static final float HEIGHT = 35;
	public static final float WIDTH = 35;
	
	Arrow arrow = null;


	public Archer() {
		life 	 = 6;
		defense  = 3;
		range 	 = 3;
		damage 	 = 8;
		mobility = 4;
		
		map_width = 30;
		map_height = 30;
		
		name = "Archer";
		
		loadTextures();
		loadAnimations();
	}
	
	public void loadAnimations() {
		int [] frames1 = { 1, 3 };
		int [] frames2 = { 1 };
		int [] frames3 = { 1, 2 };
		
		// load animation for all orientations and in all colors
		for( int orientation = 0; orientation < Constants.N_ORIENTATIONS; orientation++ )
			for( int color = 0; color < Constants.N_COLORS; color++ ) {
				loadAnimation( PREPARE, frames1, orientation, color, false, 0.4f );
				loadAnimation( SHOOT, frames2, orientation, color, false, 0.4f );
				loadAnimation( WALK, frames3, orientation, color, true, 0.4f );
			}
	}

	/**
	 * Add walk action to actions queue of stack
	 */
	public void walkAction( Stack stack, int orientation ) {
		stack.addAction( new CustomAnimation(
				getAnimation( WALK, orientation, stack.getColor() ), 0.8f, null ) );		
	}

	/**
	 * Add attack action to actions queue of stack.
	 * This action is composed by two actions:
	 * 	- prepare arc and shoot arrow
	 *  - return to initialize position
	 */
	public void attackAction( Stack stack, int orientation, CallBack callback  ) {		
		// prepare the arc and throw arrow
		stack.addAction( new CustomAnimation(
				getAnimation( PREPARE, orientation, stack.getColor() ), 1, callback) );
		
		// go back to original position
		stack.addAction( new CustomAnimation(
				getAnimation( SHOOT, orientation, stack.getColor() ), 0, null) );
	}	
}
