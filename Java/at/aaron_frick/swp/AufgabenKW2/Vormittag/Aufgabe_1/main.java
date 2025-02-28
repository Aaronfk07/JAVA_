package at.aaron_frick.swp.AufgabenKW2.Vormittag.Aufgabe_1;

public class main {
    public static void main(String[] args) {

        Car c1 = new Car("Mercedes",4);
        c1.startEngine();
        c1.honk();

        System.out.println("The Car has " + c1.getNumbereOfDoors() + " doors");
    }
}
