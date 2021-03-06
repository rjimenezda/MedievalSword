package com.modules.map;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdxgame.Assets;

public class SquarePath extends Image {
	static int HEIGHT = 16;
	static int WIDTH = 16;
	
	public SquarePath( Vector2 square_position ) {
		this.x = square_position.x + ( SquareTerrain.WIDTH - WIDTH ) / 2;
		this.y = square_position.y + ( SquareTerrain.HEIGHT - HEIGHT ) / 2;
		this.width = WIDTH;
		this.height = HEIGHT;
		
		setRegion( Assets.getTextureRegion( "number" ) );
	}
}
