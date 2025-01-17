package at.aaron_frick.swp.AufgabenKW3.Vormittag;

public class Bike {
    protected int wheels;
    protected String color;
    protected boolean Honk;
    protected String brand;

    public Bike(int wheels, String color, String brand){
        this.wheels = wheels;
        this.color = color;
        this.brand = brand;

    }

    public void drive(){
        System.out.println("Iam Driving" + brand );
    }


}
