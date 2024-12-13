package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(100, Engine.TYPE.DIESEL,60,49);

        Car c1 = new Car(e1, 10,"Opel", "121ax");
        c1.setBrand("Mercedes");
        //.drive(e1.getMotorpower());

        c1.drive(30);
        c1.drive(100);
        c1.drive(1000);
        c1.drive(1000);
        c1.drive(1000);


    }
}
