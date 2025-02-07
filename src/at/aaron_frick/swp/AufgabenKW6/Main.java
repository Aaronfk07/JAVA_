package at.aaron_frick.swp.AufgabenKW6;

public class Main {
    public static void main(String[] args) {


        Product p = new Product("red");
        System.out.println(p.getColor());

        Product p2 = new Driller("blue", "Aaron");

        System.out.println(p2.getColor());
    }


}
