package at.aaron_frick.swp;

import org.newdawn.slick.*;

public class Rectangle extends BasicGame {

    private float Circlex;
    private float Circley;
    private float Ovalx;
    private float Ovaly;

    private float x;
    private float y;
    private float speed;
    private float circelspeed;
    private float ovalspeed;
    private int Recdirection; // 0 = right, 1 = down, 2 = left, 3 = up
    private int Cirdirection;
    private int Ovaldirection;

    private static final int RIGHT = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int UP = 3;

    // Change it to an enumeration

    public Rectangle(String title) {
        super(title);
        this.Recdirection = RIGHT;
        this.Cirdirection = DOWN;
        this.Ovaldirection = RIGHT;
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.Circlex = 0;
        this.Circley = 100;

        this.Ovalx = 100;
        this.Ovaly = 0;

        this.x = 100;
        this.y = 100;
        this.speed = 0.5f;
        this.circelspeed = 1f;
        this.ovalspeed = 1f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        switch (Recdirection) {
            case 0: // Moving right
                this.x += speed * delta;
                if (this.x > 600) {
                    this.x = 600;
                    Recdirection = DOWN; // Change Recdirection to down
                }
                break;
            case 1: // Moving down
                this.y += speed * delta;
                if (this.y > 400) {
                    this.y = 400;
                    Recdirection = LEFT; // Change Recdirection to left
                }
                break;
            case 2: // Moving left
                this.x -= speed * delta;
                if (this.x < 100) {
                    this.x = 100;
                    Recdirection = UP; // Change Recdirection to up
                }
                break;
            case 3: // Moving up
                this.y -= speed * delta;
                if (this.y < 100) {
                    this.y = 100;
                    Recdirection = RIGHT; // Change Recdirection to right
                }
                break;
        }

        switch(Cirdirection){
            case DOWN:
                this.Circley += circelspeed * delta;
                if (this.Circley >= 400) {
                    this.Circley = 400;
                    Cirdirection= UP;
                }
                break;
            case UP:
                this.Circley -= circelspeed * delta;
                if (this.Circley <= 100) {
                    this.Circley = 100;
                    Cirdirection = DOWN;
                }
                break;


        }
            switch (Ovaldirection){

                case RIGHT:
                    this.Ovalx += ovalspeed * delta;
                    if(this.Ovalx >= 600){
                       this.Ovalx = 600;
                       Ovaldirection = LEFT;
                    }
                    break;
                case LEFT:
                    this.Ovalx -= ovalspeed *delta;
                    if(this.Ovalx <= 100){
                        this.Ovalx = 100;
                        Ovaldirection = RIGHT;
                    }
                    break;


            }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawString("Dies ist ein Langweiliges Spiel", 80, 80);
        graphics.drawOval(this.Circlex,this.Circley,100,100,50);
        graphics.drawOval(this.Ovalx,this.Ovaly,100,50,100);
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
