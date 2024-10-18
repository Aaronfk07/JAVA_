package at.aaron_frick.swp.String;

import java.util.Scanner;

public class Ceaser_Verschluesselung {

    private static final int SHIFT = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean running = true;


        while (running) {
            System.out.println("Drücken Sie 1 um den Code zu Entrcypten");
            System.out.println("Drücken Sie 2 um den Code zu Decrypten");
            System.out.println("Drücken Sie 3 um das Programm zu beenden");

            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {

                System.out.println("Geben sie den Code den sie encrypten wollen ein");
                String inputToEncrypt = scanner.nextLine();
                String encryptedText = encrypt(inputToEncrypt);

                System.out.println("Verschlüsselter Text: " + encryptedText);
            } else if (selection == 2) {
                System.out.println("Geben Sie den Text ein, den Sie entschlüsseln wollen");

                  String inputToDecrypt = scanner.nextLine();
                  String decryptedText = decrypt(inputToDecrypt);
                System.out.println("Entschlüsselter Text: " + decryptedText);
            } else if (selection == 3) {
                System.out.println("Programm wird beendet");
                running = false;
            }
        }
        scanner.close();

    }
    public static String encrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                char shifted = (char) (ch + SHIFT);


                if (Character.isLowerCase(ch)) {
                    if (shifted > 'z') {
                        shifted = (char) (shifted - 26);
                    }

                    result.append(shifted);
                } else if (Character.isUpperCase(ch)) {
                    if (shifted > 'Z') {
                        shifted = (char) (shifted - 26);
                    }

                    result.append(shifted);
                } else {
                    result.append(ch);
                }
            }


        }

        return result.toString();
    }
public static String decrypt(String input){
           StringBuilder result = new StringBuilder();

            for (int i = 0; i <input.length(); i++) {
                char ch = input.charAt(i);

                if(Character.isLetter(ch)){
                    char shifted = (char) (ch - SHIFT);


                    if(Character.isLowerCase(ch)){
                        if(shifted < 'a') {
                            shifted = (char) (shifted +26);
                        }
                    } else if(Character.isUpperCase(ch)) {
                        if(shifted < 'A') {
                            shifted = (char) (shifted + 26);
                        }
                    }
                    result.append(shifted);
                } else {
                    result.append(ch);
                }
            }
                return  result.toString();
            }
        }





