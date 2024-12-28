package com.project.spaceinvaderfx.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;

public class Player {
    private double x, y;
    private double speed = 5;
    private boolean movingLeft = false;
    private boolean movingRight = false;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        if (movingLeft) x -= speed;
        if (movingRight) x += speed;

        // Keep the player within the bounds
        if (x < 0) x = 0;
        if (x > 350) x = 350; // Assuming the canvas width is 400
    }

    public void render(GraphicsContext gc) {
        gc.fillRect(x, y, 50, 20); // Placeholder for the player's rectangle
    }

    public void handleInput(KeyCode code, boolean isPressed) {
        switch (code) {
            case LEFT -> movingLeft = isPressed;
            case RIGHT -> movingRight = isPressed;
        }
    }
}
