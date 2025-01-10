package at.aaron_frick.swp.AufgabenKW2.Vormittag.Aufgabe_1;

public class Figuren {
    protected double xpos = 100.0, ypos = 100.0;
    public Figuren(double x, double y) {
        if (x >= 0 && y >= 0) {
            xpos = x;
            ypos = y;
        }
    }
    public Figuren() {}
    public void wo() {
        System.out.println("\nOben links: (" + xpos + ", " + ypos + ") ");
    }
}


