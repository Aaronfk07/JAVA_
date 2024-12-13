package at.aaron_frick.swp.OO_erstesObjekt;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    ;
    private int horsepower;
    private TYPE type;
    private int tank;
    private int motorpower;

    public Engine(int horsepower, TYPE type, int tank,int motorpower) {
        this.horsepower = horsepower;
        this.type = type;
        this.tank = tank;
        this.motorpower = motorpower;
    }

    public void setmotorpower(int power) {
        if(power > 1 || power < 100){
           this.motorpower = power;
            System.out.println("Motorleistung ist " + motorpower);
        } else {
            System.out.println("Motorleistung muss zwischen 1 und 100 sein");
        }
    }

    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public int getTank() {
        return tank;
    }

    public int getMotorpower() {
        return motorpower;
    }
}