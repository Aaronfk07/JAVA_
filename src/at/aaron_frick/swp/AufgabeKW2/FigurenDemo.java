package at.aaron_frick.swp.AufgabeKW2;

import at.aaron_frick.swp.AufgabeKW2.Figuren;
import at.aaron_frick.swp.AufgabeKW2.Figuren.*;
import at.aaron_frick.swp.AufgabeKW2.Kreis;

class FigurenDemo {
    public static void main(String[] ars) {
        Figuren f = new Figuren(10.0, 20.0);
        f.wo();
        Kreis k = new Kreis(50.0, 100.0, 25.0);
        k.wo();
    }
}
