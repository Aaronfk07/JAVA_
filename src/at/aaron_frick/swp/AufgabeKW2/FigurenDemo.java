package at.aaron_frick.swp.AufgabeKW2;

import at.aaron_frick.swp.AufgabeKW2.Figuren;
import at.aaron_frick.swp.AufgabeKW2.Figuren.*;
import at.aaron_frick.swp.AufgabeKW2.Kreis;

class FigurenDemo {
    public static void main(String[] args) {
        Figuren fig = new Figuren(50.0, 50.0);
        System.out.println();
        Kreis krs = new Kreis(10.0, 10.0, 5.0);
    }
}

