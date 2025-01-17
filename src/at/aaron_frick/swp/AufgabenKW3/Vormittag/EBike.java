package at.aaron_frick.swp.AufgabenKW3.Vormittag;

public class EBike extends Bike{
    int Akkupower;

    public EBike(int wheels, String color, String brand, int Akkupower){
        super(wheels,color,brand);

        this.Akkupower = Akkupower;

    }
    public void edrive(){
        System.out.println("Iam using" + Akkupower + "Megawatts of power");
    }
}
