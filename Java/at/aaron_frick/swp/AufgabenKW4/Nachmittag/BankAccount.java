package at.aaron_frick.swp.AufgabenKW4.Nachmittag;

    import java.util.Scanner;

    class BankAccount {
        private String owner;
        private double balance;
        private static String bankName = "MeineBank";

        public BankAccount(String owner, double initialBalance) {
            this.owner = owner;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Einzahlung erfolgreich! Neuer Kontostand: " + balance + " EUR");
            } else {
                System.out.println("Ungültiger Betrag!");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Abhebung erfolgreich! Neuer Kontostand: " + balance + " EUR");
            } else {
                System.out.println("Fehler: Ungültiger Betrag oder unzureichendes Guthaben!");
            }
        }

        public void displayBalance() {
            System.out.println("Kontoinhaber: " + owner);
            System.out.println("Kontostand: " + balance + " EUR");
        }

        public static void changeBankName(String newName) {
            bankName = newName;
            System.out.println("Der neue Bankname lautet: " + bankName);
        }

        public static String getBankName() {
            return bankName;
        }
    }




