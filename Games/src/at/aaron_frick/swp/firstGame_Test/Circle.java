package at.aaron_frick.swp.firstGame_Test;

import at.aaron_frick.swp.FirstGame.Objects_Game;
import org.newdawn.slick.Graphics;

public class Circle {

    private Direction direction = Direction.DOWN;

    public enum Direction {
        RIGHT, DOWN, LEFT, UP
    }

    private float x;
    private float y;
    private float speed;

    public Circle(int x, int y, float speed) {
        this.x = 0;
        this.y = 100;
        this.speed = 1f;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 100, 100);

    }

    public void update(int delta) {
        switch (direction) {
            case DOWN:
                this.y += speed * delta;
                if (this.y >= 400) {
                    this.y = 400;
                    direction = Direction.UP;
                }
                break;
            case UP:
                this.y -= speed * delta;
                if (this.y <= 100) {
                    this.y = 100;
                    direction = Direction.DOWN;
                }
                break;


        }
    }
}