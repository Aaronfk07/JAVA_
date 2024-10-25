package at.aaron_frick.swp.StringHelper;

import java.util.Scanner;

public class StringHelper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib ein Wort ein: ");
        String inputWord = scanner.nextLine();

        boolean isPalindrome = isPalindrome(inputWord);
        // so
        if (isPalindrome) {
            System.out.println(inputWord + " ist ein Palindrom");
        } else {
            System.out.println(inputWord + " ist kein Palindrom");
        }

        System.out.println("Gib einen Buchstaben ein um ihn zu zählen:");
        char letterToCount = scanner.next().charAt(0);

        int count = countLetters(inputWord,letterToCount);
        System.out.println("Im Wort: " + inputWord + " kommt der Buchstabe: "+ letterToCount + " kommt " + count + " mal vor" );

        System.out.println(count);

        /* Reverse String */
        String reversed = reverseString(inputWord);

        System.out.println("Das umkeherte wort heißt: " + reversed);

        /* Print amount of letters */
        int amountOfLetters = getAmountOfLetters(inputWord);

        System.out.println("Das Wort ist" + amountOfLetters + " Buchstaben lang.");
    }

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static int countLetters(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == c) {
                count ++;
            }
        }
        return count;
    }

    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static int getAmountOfLetters(String word) {
        return word.length();
    }
}

