package at.aaron_frick.swp.AufgabeKW2.Aufgabe_1;

public class Vehicle {

    String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void startEngine(){
        System.out.println("The engine of" + brand + "is starting");
    }
}
