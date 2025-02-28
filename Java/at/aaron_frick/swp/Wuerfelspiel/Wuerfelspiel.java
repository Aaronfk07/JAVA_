package at.aaron_frick.swp.Wuerfelspiel;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean play = true;

        while(play) {
            System.out.println("Willkommen beim Würfelnspiel");
            System.out.println(" 1 - Spiel Starten");
            System.out.println(" 2 - Spiel beenden");

             int selection = scanner.nextInt();
            System.out.println(selection);

            switch(selection){

                case 1:
                    int playerSum = wuerfelnPlayer(random);
                    int computerSum = wuerfelnComputer(random);

                    System.out.println("Spieler hat insgesamt " + playerSum + " Punkte!");
                    System.out.println("Computer hat insgesamt " + computerSum + " Punkte!");

                    if (playerSum > computerSum) {
                        System.out.println("Glückwunsch! Du hast gewonnen!");
                    } else if (playerSum < computerSum) {
                        System.out.println("Der Computer hat gewonnen!");
                    } else {
                        System.out.println("es ist ein Unentschieden!");
                    }
                    break;

                case 2:
                    System.out.println("Spiel beendet.");
                    play = false;
                    break;

                default:
                    System.out.println("Unglütige Auswahlt.");
                    break;

        }
    }
        scanner.close();


    }
    private static int wuerfelnPlayer(Random random){
        System.out.println("Du würfelst jetzt 6 mal.");
        int playerSum = 0;

        for (int i = 0; i < 6; i++) {
            int wurf = random.nextInt(6) + 1;

            playerSum += wurf;
            System.out.println("Wurf "  + i + ": Du hast eine "+ wurf  + " geworfen. ");

        }
        return playerSum;
    }

    private static int wuerfelnComputer(Random random){

        System.out.println("Der Computer würfelt jetzt 6 mal");
        int computerSum = 0;

        for (int i = 0; i < 6; i++){
            int wurf = random.nextInt(6) + 1;
            computerSum += wurf;
            System.out.println("Wurf " + i + " Computer hat eine " + wurf + " geworfen");
        }
        return computerSum;
    }
}

