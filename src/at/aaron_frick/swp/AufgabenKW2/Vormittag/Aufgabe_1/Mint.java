package at.aaron_frick.swp.AufgabenKW2.Vormittag.Aufgabe_1;

public class Mint {
    public int value;
    public Mint(int value) {
        this.value = value;
    }
    public Mint() {}
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}