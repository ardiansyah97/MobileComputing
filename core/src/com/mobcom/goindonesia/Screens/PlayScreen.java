package com.mobcom.goindonesia.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mobcom.goindonesia.GOIndonesia;
import com.mobcom.goindonesia.Scenes.Hud;

/**
 * Created by Ardiansyah on 26/09/2017.
 */

public class PlayScreen implements Screen{
    private GOIndonesia game;

    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;


    public PlayScreen(GOIndonesia game){
        this.game = game;
        //texture = new Texture("badlogic.jpg");
        gamecam = new OrthographicCamera();
        //gamePort = new StretchViewport(800, 480, gamecam); // percobaan Viewport 1
        //gamePort = new ScreenViewport(gamecam); // percobaan Viewport 2
        //gamePort = new FitViewport(800, 480, gamecam); // percobaan Viewport 3
        gamePort = new FitViewport(GOIndonesia.v_width, GOIndonesia.v_height, gamecam); // percobaan 4
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {

    }



    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /*game.batch.setProjectionMatrix(gamecam.combined);
        game.batch.begin();
        game.batch.draw(texture, 0, 0);
        game.batch.end();*/

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

        game.batch.begin();
        game.ball.draw(game.batch);
        if(Gdx.input.isTouched()){
            if(Gdx.input.getX() <= 0.25 * game.v_width) {
                if(game.ball.getX() != 0) {
                    game.ball.setPosition(game.ball.getX() - 10, game.ball.getY());
                }
            }
            if (Gdx.input.getX() >= game.v_width - (0.25 * game.v_width)){
                if(game.ball.getX() <= game.v_width-72) {
                    game.ball.setPosition(game.ball.getX() + 10, game.ball.getY());
                }
            }

        }

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
