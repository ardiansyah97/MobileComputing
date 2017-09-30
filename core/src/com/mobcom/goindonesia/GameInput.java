package com.mobcom.goindonesia;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Ardiansyah on 30/09/2017.
 */

public class GameInput {
    public static Vector2 touchInput = new Vector2();

    public static void update(){
        touchInput.x = 0;

        if(Gdx.input.isTouched()){
            if(Gdx.input.getX() <= 0.25 * Gdx.graphics.getWidth()) {
                touchInput.x -= 1;
            }

            if (Gdx.input.getX() >= 0.75 * Gdx.graphics.getWidth()){
                touchInput.x += 1;
            }
        }
    }
}
