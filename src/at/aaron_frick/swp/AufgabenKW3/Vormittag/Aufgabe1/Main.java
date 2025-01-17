package at.aaron_frick.swp.AufgabenKW3.Vormittag.Aufgabe1;

public class Main {
    public static void main(String[] args) {

        Fish goldfish = new Fish("Goldfisch", 10);


        Shark whiteShark = new Shark("Weißer Hai", 300, 50);


        Clownfish nemo = new Clownfish("Nemo", 15, "Orange mit weißen Streifen");


        goldfish.swim();
        goldfish.describe();

        whiteShark.swim();
        whiteShark.describe();
        whiteShark.describe("Hat 50 scharfe Zähne und ist sehr gefährlich.");

        nemo.swim();
        nemo.describe();
    }
}