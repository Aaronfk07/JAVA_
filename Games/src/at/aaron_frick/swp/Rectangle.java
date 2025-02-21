package at.aaron_frick.swp;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {

    private float a;
    private float b;
    private float c;
    private float d;

    private float x;
    private float y;
    private float speed;
    private float circelspeed;
    private float ovalspeed;
    private int direction; // 0 = right, 1 = down, 2 = left, 3 = up

    public Rectangle(String title) {
        super(title);
        this.direction = 0; // Start moving to the right
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.a = 0;
        this.b = 0;

        this.c = 100;
        this.d = 0;

        this.x = 100;
        this.y = 100;
        this.speed = 0.5f;
        this.circelspeed = 1f;
        this.ovalspeed = 2f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

            if (this.b < 700) {
                this.b += speed * delta;

            }
            if (this.b > 500) {
                this.b = 0;
            }

        if (this.c < 600) {
            this.c += speed * delta;

        }
        if (this.c > 500) {
            this.c = 100;
        }

        switch (direction) {
            case 0: // Moving right
                this.x += speed * delta;
                if (this.x > 600) {
                    this.x = 600;
                    direction = 1; // Change direction to down
                }
                break;
            case 1: // Moving down
                this.y += speed * delta;
                if (this.y > 400) {
                    this.y = 400;
                    direction = 2; // Change direction to left
                }
                break;
            case 2: // Moving left
                this.x -= speed * delta;
                if (this.x < 100) {
                    this.x = 100;
                    direction = 3; // Change direction to up
                }
                break;
            case 3: // Moving up
                this.y -= speed * delta;
                if (this.y < 100) {
                    this.y = 100;
                    direction = 0; // Change direction to right
                }
                break;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawString("Dies ist ein Langweiliges Spiel", 80, 80);
        graphics.drawOval(this.a,this.b,100,100,50);
        graphics.drawOval(this.c,this.d,100,50,100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
