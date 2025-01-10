package at.aaron_frick.swp.AufgabeKW2.Aufgabe_1;

public class Car extends Vehicle {
    int numbereOfDoors;

    public Car(String brand, int numbereOfDoors) {
        super(brand);
        this.numbereOfDoors = numbereOfDoors;
    }

    public void honk(){
        System.out.println("The " + brand + "car is honking!");
    }

    public int getNumbereOfDoors() {
        return numbereOfDoors;
    }
}
