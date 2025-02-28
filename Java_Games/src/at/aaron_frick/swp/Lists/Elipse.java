package at.aaron_frick.swp.Lists;

import org.newdawn.slick.Graphics;

public class Elipse implements Actor{


    private float x,y;
    private float speed;

    public Elipse(float x, float y,float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,10);
    }

    @Override
    public void update(int delta) {
        this.x += (float)delta/this.speed;
        if(this.x > 800){
            this.x = 0;
        }
        this.y += (float)delta/this.speed;
        if(this.y > 800){
            this.y = 0;
        }
        this.y += (float)delta/this.speed;

    }
}
