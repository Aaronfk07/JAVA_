package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(100, Engine.TYPE.DIESEL,60,49);

        Car c1 = new Car(e1, 10,"Opel", "121ax");
        c1.setBrand("Mercedes");
        c1.drive(e1.getMotorpower());

    }
}
