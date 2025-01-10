package at.aaron_frick.swp.OO_erstesObjekt;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(100, Engine.TYPE.DIESEL,60,49);

        Tires t1 = new Tires(4,"Michelin");

        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-50);
//        RearMirror r3 = new RearMirror(90,-50);
//        RearMirror r4 = new RearMirror(90,-50);
        Car c1 = new Car(t1,e1, 10,"Opel", "121ax");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.setBrand("Mercedes");
        //.drive(e1.getMotorpower());

        System.out.println(c1.getMirrors().get(0).getPosition());


        c1.drive(30);

    }
}
