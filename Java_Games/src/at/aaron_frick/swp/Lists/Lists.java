package at.aaron_frick.swp.Lists;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lists extends BasicGame {


    private List<Actor> actors;


    public Lists(String title) {
        super(title);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Lists("MNG"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(500), random.nextInt(500), random.nextInt(50));
            this.actors.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
        }
        for (int i = 0; i < 5; i++) {
            Elipse elipse = new Elipse(random.nextInt(700), random.nextInt(600), random.nextInt(20));
            this.actors.add(elipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }
}


