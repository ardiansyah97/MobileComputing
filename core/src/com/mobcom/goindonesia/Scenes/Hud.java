package com.mobcom.goindonesia.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mobcom.goindonesia.GOIndonesia;

/**
 * Created by Ardiansyah on 27/09/2017.
 */

public class Hud {
    public Stage stage;
    public Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label gameLabel;

    public Hud(SpriteBatch sb){
        worldTimer = 000000;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(GOIndonesia.v_width, GOIndonesia.v_height, new OrthographicCamera());
        stage = new Stage(viewport, sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        countdownLabel = new Label(String.format("Health Bar", worldTimer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format("%06d", score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel = new Label("300", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(countdownLabel).expandX().padTop(10);
        table.add(levelLabel).expandX().padTop(10);
        table.add(scoreLabel).expandX().padTop(10);
        table.row();

        stage.addActor(table);

    }

}

