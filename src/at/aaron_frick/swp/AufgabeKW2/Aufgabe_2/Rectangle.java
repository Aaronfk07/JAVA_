package at.aaron_frick.swp.AufgabeKW2.Aufgabe_2;

public class Rectangle extends Shape{
    private double length;
    private double width;


    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length*width;
    }

    @Override
    public void describe(){
        System.out.println("This is a rectangle");
    }

    public void describe(String describtion){
        System.out.println("This is a rectangle described as " + describtion );
    }

}
