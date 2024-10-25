package at.aaron_frick.swp.OO_erstesObjekt;

public class Car {
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public int fuelAmount;
    private String color;
    //public int amountOfRepetitions;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am Driving");
    }

    public void breaking() {
        String breaks = "ich bremse";
        System.out.println(breaks);
    }

    public void turboboost() {
        if (this.fuelAmount > fuelAmount * 0.1) {
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

    public void getRemainingRange(){
        if(fuelConsumption > 0){
            System.out.println( (fuelAmount/fuelConsumption)*100 + "km");
        } else {
            System.out.println(0 + "km");
        }
    }
}

