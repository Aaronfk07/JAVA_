package at.aaron_frick.swp.OO_erstesObjekt;

public class Car {
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public int fuelAmount;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am Driving");
    }
}
