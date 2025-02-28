package at.aaron_frick.swp.Woerter_raten;

import java.util.Random;
import java.util.Scanner;

public class Woerter_raten {
    public static void main(String[] args) {

        String[] words =  {
                "java",
                "programmieren",
                "entwickler",
                "computer",
                "algorithmus",
                "software",
                "hardware",
                "variable",
                "klasse",
                "objekt",
                "methoden",
                "vererbung",
                "interface",
                "abstraktion",
                "polymorphismus",
                "datenbank",
                "framework",
                "netzwerk",
                "internet",
                "anwendung"
        };
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];

        char[] guessedword = new char[word.length()];
        for (int i = 0; i <word.length(); i++) {
            guessedword[i] = '*';

        }

        Scanner scanner = new Scanner(System.in);
        boolean won = false;

        while (!won) {
            System.out.print("Gesuchtes Wort: ");
            System.out.println(guessedword);

            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? ");
            char letter = scanner.next().charAt(0);

            boolean rightguess = false;
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == letter) {
                    guessedword[i] = letter;
                    rightguess = true;
                }

            }

            if (rightguess) {
                System.out.println("Richtig geraten!");
            } else {
                System.out.println("Leider falsch!");
            }


            won = true;

            for (int i = 0; i < guessedword.length; i++) {
                if( guessedword[i] == '*') {
                    won = false;
                    break;
                }

            }
        }


        System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten: " + word);
        scanner.close();
    }
}
