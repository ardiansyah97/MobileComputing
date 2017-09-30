package com.mobcom.goindonesia;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Ardiansyah on 30/09/2017.
 */

public class GameObject {
    float x = 0;
    float y = 0;

    private Texture texture;
    private SpriteBatch spriteBatchHandle;



    public GameObject(String texture_path, SpriteBatch batch, float posX, float posY){
        spriteBatchHandle = batch;
        texture = new Texture(texture_path);
        x = posX;
        y = posY;
    }

    public void updatePosition(){
        float speed = 5;

        x += GameInput.touchInput.x * speed;
    }

    public void draw(){
        spriteBatchHandle.draw(texture,x, y);
    }
}
