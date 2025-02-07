package at.aaron_frick.swp;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {

    private float x;
    private float y;
    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.x = 100;
    this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
    this.x += 0.1F;
    this.y += 0.1F;

        if(this.x>700 && this.y>500){
        this.x = 0;
        this.y = 0;
     }
    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString("Dies ist ein Langweiliges Spiel",80,80);
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
