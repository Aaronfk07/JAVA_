package at.aaron_frick.swp.AufgabenKW2.Nachmittag.Aufgabe_2;

public class sitz {
    public String farbe;
    public boolean hatGurt;

    public sitz(String farbe, boolean hatGurt){
        this.farbe = farbe;
        this.hatGurt = hatGurt;
    }

    public boolean isHatGurt() {
        return hatGurt;
    }

    public String getFarbe() {
        return farbe;
    }
    @Override
    public String toString() {
        return farbe +(hatGurt ? "mit Gurt": "ohne Gurt");
    }
}
