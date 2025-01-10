package at.aaron_frick.swp.AufgabeKW2;

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