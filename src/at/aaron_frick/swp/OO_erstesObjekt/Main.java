package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(100, Engine.TYPE.DIESEL);

        Car c1 = new Car(e1, 10,"Opel", "121ax");
        c1.setBrand("Mercedes");
        System.out.println(c1.getBrand());


    }
}
