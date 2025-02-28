package at.aaron_frick.swp.Lists;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle {

    private float x;
    private float y;
    private float speed;
    private float diameter;

    public Circle(int x, int y, float speed, float diameter) {
        Random random = new Random();
        this.x = random.nextInt(600);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(2);
        this.diameter = random.nextInt(100);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);

    }

    public void update(int delta) {
        this.x += 10;
        if (this.x < 800) {
            this.x = 0;

        }
    }
}

