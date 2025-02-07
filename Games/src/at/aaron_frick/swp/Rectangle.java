package at.aaron_frick.swp;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {

    private float a;
    private float b;

    private float x;
    private float y;
    private float speed;
    private float backspeed;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
   this.a = 50;
   this.b = 50;

    this.x = 100;
    this.y = 100;
    this.speed = 10.0f;
    this.backspeed = -10f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if(this.x<600) {
            this.x += (float) delta / this.speed;
        }
        if (this.x > 700) {
            this.x = 600;
            this.y = 100;
        }
        if (this.x > 600) {
            this.y += (float) delta / this.speed;
            this.x += 0;
        }

        if(this.y >600){
          this.x = 600;
          this.y = 500;
        }
        if(this.y>500){
            this.x += (float) delta / this.backspeed;
            this.y= 0;
        }

//        this.y += 0;
    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString("Dies ist ein Langweiliges Spiel",80,80);
        graphics.drawRoundRect(this.a,this.b,20,20,25);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
