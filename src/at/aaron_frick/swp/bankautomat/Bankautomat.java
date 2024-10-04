package at.aaron_frick.swp.bankautomat;

import java.util.Scanner;

public class Bankautomat {

    private static double kontostand = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int selection = scanner.nextInt();
        System.out.println(selection);

        boolean resume = true;

        while (resume) {
            System.out.println("Willkommen beim Bankautomat!");
            System.out.println("Bitte wählen sie eine Option!");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");


            selection = scanner.nextInt();
            System.out.println(selection);

            switch(selection){
                case 1:
                    einzahlen(scanner);
                    break;
                case 2: abheben(scanner);
                    break;
                case 3:
                    kontostandAnzeigen();
                    break;
                case 4:
                    resume = false;
                    System.out.println("Vielen Dank, auf Wiedersehen!");
                    break; default:
                    System.out.println("Ungültige Auswahl. Bitte etwas anders");

            }
        }
        scanner.close();
    }

    private static void einzahlen(Scanner scanner) {
        System.out.println("Wie viel möchten sie einzahlen: ");
        double betrag = scanner.nextDouble();

        if(betrag>0){
            kontostand += betrag;
            System.out.println(betrag + "€ wurde erfolgreich eingezahlt");
        } else {
            System.out.println("Ungültiger Betrag.");
        }
    }

    private static void abheben(Scanner scanner){
        System.out.println("Geben sie den Betrag ein, den Sie abheben möchten:");
        double betrag = scanner.nextDouble();

        if(betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println(betrag + "€ wurde erfolgreich abgehoben");
        } else if(betrag > kontostand) {
            System.out.println("kontostand ist unzureichend");
        } else{
            System.out.println("Ungültiger kontostand");
        }
    }

    private static void kontostandAnzeigen(){
        System.out.println("Ihr kontostand beträgt: " + kontostand + "€");
    }
 }

