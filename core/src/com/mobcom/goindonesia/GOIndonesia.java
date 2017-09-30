package com.mobcom.goindonesia;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GOIndonesia extends ApplicationAdapter{
	public SpriteBatch batch;
    public GameObject object;

    @Override
    public void create() {
        batch = new SpriteBatch();
        object = new GameObject("sprite/touchKnob.png", batch, 0, 0);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        batch.begin();
        GameInput.update();
        object.updatePosition();
        object.draw();
        batch.end();
    }
}
