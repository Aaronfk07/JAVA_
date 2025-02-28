package at.aaron_frick.swp;

import at.aaron_frick.swp.FirstGame_v2.Rectangle;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lists extends BasicGame {


    private List<Rectangle> rectangles;

    public Lists(String title) {
        super(title);
    }



    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.rectangles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(500), random.nextInt(500), random.nextInt(50));
            rectangles.add(rectangle);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.aaron_frick.swp.Lists("MN"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}


