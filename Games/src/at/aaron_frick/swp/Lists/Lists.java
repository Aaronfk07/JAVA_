package at.aaron_frick.swp.Lists;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lists extends BasicGame {


    private List<Rectangle> rectangles;
    private List<Circle> circles;

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

        this.rectangles = new ArrayList<>();
        this.circles = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(500), random.nextInt(500), random.nextInt(50));
            rectangles.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle(random.nextInt(500), random.nextInt(500), random.nextInt(50), random.nextInt(100));
            circles.add(circle);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.update(delta);
        }
        for (Circle circle : this.circles) {
            circle.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.render(graphics);
        }

        for (Circle circle : this.circles) {
            circle.render((graphics));
        }

    }
}


