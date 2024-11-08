package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        int a = 7;


        Car c1 = new Car(10,"Opel","O9876M",34);
        Car c2 = c1;
        System.out.println(c1.getBrand());
        c1.setBrand("Mercedes");

        System.out.println(c1.getBrand());



//
//        Car c2 = new Car();
//        c2.fuelConsumption = 9;
//        c2.brand = "BMW";
//        c2.serialNumber = "B2345B";
//        c2.fuelAmount = 45;

        Car c3 = new Car(10,"merdes", "M3256",34);


        System.out.println(c3.getFuelAmount());
        c3.drive();
        System.out.println(c3.getFuelAmount());

        c3.breaking();

        c3.turboboost();

        c3.honk(2);

        c3.getRemainingRange();
    }
}
