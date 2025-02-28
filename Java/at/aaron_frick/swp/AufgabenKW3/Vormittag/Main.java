package at.aaron_frick.swp.AufgabenKW3.Vormittag;

public class Main {
    public static void main(String[] args) {


        Bike b1 = new Bike(2, "Blue", "Salomon");
        b1.drive();
        EBike eb1 = new EBike(2,"Red","Rotwild",30);

        eb1.edrive();

    }
}
