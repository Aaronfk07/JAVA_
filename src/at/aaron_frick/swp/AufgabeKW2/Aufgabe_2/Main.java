package at.aaron_frick.swp.AufgabeKW2.Aufgabe_2;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(5.0);
        c1.describe();
        System.out.println("Area of the circle " + c1.area());




        Rectangle r1 = new Rectangle(10.0,20.0);

       r1.describe();

        r1.describe("Big Blue Shape");
        System.out.println("Area of the Rectangle " + r1.area());
    }
}
