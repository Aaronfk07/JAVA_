package at.aaron_frick.swp.if_condition;

import java.util.Random;

public class IFBedingung2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(100);
        int randomnumber2 = random.nextInt(100);

        if((randomnumber>randomnumber2) && (randomnumber<50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2" + "Mini");
        } else if ((randomnumber<30) || (randomnumber2<30)) {
            System.out.println("Einer der beiden Zahlen ist kleiner als 30");
            
        } else if ((randomnumber<50) && (randomnumber2!=50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
