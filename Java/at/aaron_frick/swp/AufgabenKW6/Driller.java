package at.aaron_frick.swp.AufgabenKW6;

public class Driller extends Product {

    public String brand;


    public Driller(String color, String brand){
        super(color);
        this.brand = brand;
    }


    public void drill() {
        System.out.println("Iam Drilling" + brand);

    }


}
