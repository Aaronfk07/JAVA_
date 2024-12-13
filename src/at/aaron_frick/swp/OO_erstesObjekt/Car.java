package at.aaron_frick.swp.OO_erstesObjekt;

import java.util.ArrayList;
import java.util.List;

public class Car {
   private List<RearMirror> mirrors;
    private Engine engine;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private int fuelAmount;
    private String color;
    private Tires tires;

    public Car(Tires tires,Engine  engine, int fuelConsumption, String brand, String serialNumber) {
        this.tires = tires;
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = 300;
        this.mirrors = new ArrayList<>();
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(int speed) {
        if (speed < 1 || speed > 1000) {
            System.out.println("Geschwindigkeit muss zwischen 1 und 1000 liegen");
            return;
        }
        if (fuelAmount <= 0) {
            System.out.println("tank ist leer! Bitte Tanken.");
            return;
        }

        int fuelConsumptionForDrive = speed / getFuelConsumption();
        if (fuelAmount >= fuelConsumptionForDrive) {
            fuelAmount -= fuelConsumptionForDrive;
            System.out.println("Das Auto fährt mit Geschwindigkeit " + speed);
            System.out.println("Verbrauch: " + fuelConsumptionForDrive + " Liter. Verbleibender Tank: " + fuelAmount);
        } else {
            System.out.println("nicht genug Treibstoff für diese Geschwindigkeit");
        }
    }

    public void breaking() {
        System.out.println("ich bremse");
    }

    public void turboboost() {
        if (fuelAmount > fuelAmount * 0.1) {
            System.out.println("Superturboboostmode");
        } else {
            System.out.println("not enough fuel");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        if (fuelConsumption > 0) {
            System.out.println((fuelAmount / fuelConsumption) * 100 + "km");
        } else {
            System.out.println("0km");
        }
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }
}
