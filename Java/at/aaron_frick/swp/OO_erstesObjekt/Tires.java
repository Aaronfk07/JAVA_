package at.aaron_frick.swp.OO_erstesObjekt;

public class Tires {

    private int raeder;
    private String reifenhersteller;

    public Tires(int raeder, String reifenhersteller) {
        this.raeder = raeder;
        this.reifenhersteller = reifenhersteller;
    }

    public int getRaeder() {
        return raeder;
    }

    public String getReifenhersteller() {
        return reifenhersteller;
    }
}