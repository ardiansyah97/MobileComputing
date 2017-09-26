package com.mobcom.goindonesia;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mobcom.goindonesia.Screens.PlayScreen;

public class GOIndonesia extends Game {
	public SpriteBatch batch;
    public Texture texture;
    public Sprite ball;
    public static int v_width, v_height;

    private static final String TAG_LIFECYCLE="Lifecycle";

	@Override
	public void create () {
        Gdx.app.log(TAG_LIFECYCLE,"create()");

		batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("sprite/touchKnob.png"));


        v_height = Gdx.graphics.getHeight();
        v_width = Gdx.graphics.getWidth();

        ball = new Sprite(texture, 0, 0, 72, 72);
        ball.setPosition(10, 50);

        setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
        Gdx.app.log(TAG_LIFECYCLE,"render()");
		super.render();
	}
	
	@Override
	public void dispose () {
        Gdx.app.log(TAG_LIFECYCLE,"dispose()");

		batch.dispose();
	}

    @Override
    public void pause() {
        Gdx.app.log(TAG_LIFECYCLE,"pause()");
        super.pause();
    }

    @Override
    public void resume() {
        Gdx.app.log(TAG_LIFECYCLE,"resume()");
        super.resume();
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(TAG_LIFECYCLE,"resize()");
        super.resize(width, height);
    }
}
