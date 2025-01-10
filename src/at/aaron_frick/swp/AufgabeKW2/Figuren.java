package at.aaron_frick.swp.AufgabeKW2;

public class Figuren {
    protected double xpos = 100.0, ypos = 100.0;

    public Figuren(double x, double y) {
        if (x >= 0 && y >= 0) {
            xpos = x;
            ypos = y;
        }
        System.out.println("Figur-Konstruktor");
    }

    public Figuren() {
        System.out.println("Figur-Konstruktor");
    }
}

