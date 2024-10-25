package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        int a = 7;


        Car c1 = new Car();
        c1.fuelConsumption = 7;
        c1.brand = "Audi";
        c1.serialNumber = "A1234B";

        Car c2 = new Car();
        c2.fuelConsumption = 9;
        c2.brand = "BMW";
        c2.serialNumber = "B2345B";

        System.out.println(c1.brand);
    }
}
