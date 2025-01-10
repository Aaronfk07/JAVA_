package at.aaron_frick.swp.AufgabenKW2.Nachmittag.Aufgabe_1;

public class Circle extends Shape {

    private double Radius;

    public Circle(double Radius){
        this.Radius = Radius;
    }

    @Override
    public double area(){
        return Math.PI * Radius * Radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a circle with radius " + Radius + ".");
    }
}
