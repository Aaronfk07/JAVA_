package at.aaron_frick.swp.AufgabeKW2;

import at.aaron_frick.swp.AufgabeKW2.Figuren;
import at.aaron_frick.swp.AufgabeKW2.Figuren.*;
import at.aaron_frick.swp.AufgabeKW2.Kreis;

class FigurenDemo {
    public static void main(String[] args) {
        Kreis k1 = new Kreis(50.0, 50.0, 30.0);
        System.out.println("Abstand von (100, 100): " + k1.abstand(100.0, 100.0));

    }
}

