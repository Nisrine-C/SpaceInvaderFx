package com.project.spaceinvaderfx.controller;

import com.project.spaceinvaderfx.model.Player;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

public class GameController {
    @FXML
    private Canvas gameCanvas;

    private Player player;
    private GraphicsContext gc;

    public void initialize() {
        gc = gameCanvas.getGraphicsContext2D();
        player = new Player(200, 350);

        // Start the game loop
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
                render();
            }
        }.start();
    }

    private void update() {
        // Update player position
        player.update();
    }

    private void render() {
        gc.clearRect(0, 0, gameCanvas.getWidth(), gameCanvas.getHeight());
        player.render(gc);
    }

    @FXML
    private void onKeyPressed(KeyEvent event) {
        player.handleInput(event.getCode(), true);
    }

    @FXML
    private void onKeyReleased(KeyEvent event) {
        player.handleInput(event.getCode(), false);
    }
}
