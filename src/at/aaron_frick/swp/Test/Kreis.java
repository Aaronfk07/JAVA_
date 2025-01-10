package at.aaron_frick.swp.Test;

import at.aaron_frick.swp.AufgabeKW2.Figuren;

public class Kreis extends Figuren {
    protected double radius = 50.0;

    public Kreis(double x, double y, double rad) {
        super(x, y);
        if (rad >= 0)
            radius = rad;
    }
}