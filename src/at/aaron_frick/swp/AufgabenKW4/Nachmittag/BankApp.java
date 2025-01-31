package at.aaron_frick.swp.AufgabenKW4.Nachmittag;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei " + BankAccount.getBankName());
        System.out.print("Geben Sie den Namen des Kontoinhabers ein: ");
        String name = scanner.nextLine();
        System.out.print("Geben Sie den Startbetrag ein: ");
        double balance = scanner.nextDouble();
        BankAccount account = new BankAccount(name, balance);

        while (true) {
            System.out.println("\nOptionen:");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung");
            System.out.println("3. Abhebung");
            System.out.println("4. Bankname ändern");
            System.out.println("5. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;
                case 2:
                    System.out.print("Betrag für Einzahlung: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Betrag für Abhebung: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Neuen Banknamen eingeben: ");
                    scanner.nextLine();  // Puffer leeren
                    String newBankName = scanner.nextLine();
                    BankAccount.changeBankName(newBankName);
                    break;
                case 5:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Option! Bitte erneut versuchen.");
            }
        }
    }
}
