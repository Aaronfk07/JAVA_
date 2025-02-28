package at.aaron_frick.swp.AufgabenKW5.Interface;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("\n1. Show Products");
            System.out.println("2. Show Total Shop Value");
            System.out.println("3. Add to Cart");
            System.out.println("4. Show Cart Total");
            System.out.println("5. Show Products With Logo");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    shop.showProducts();
                    break;
                case 2:
                    System.out.println("Total Stock Value: $" + shop.getTotalStockValue());
                    break;
                case 3:
                    System.out.print("Enter product Name to add to cart: ");
                    String productName = scanner.nextLine();
                    shop.addToCart(productName);
                    break;
                case 4:
                    System.out.println("Cart Total: $" + shop.getCartTotal());
                    break;
                case 5:
                    shop.showProductsWithLogo();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}