package at.aaron_frick.swp.Amazon.gui;

import at.aaron_frick.swp.Amazon.shops.Shop;


import java.util.Scanner;

public class GUI1 {
    private Scanner scanner = new Scanner(System.in);
    private Shop shop;


    public GUI1(Shop shop) {
        this.shop = shop;
    }

    public void start() {
        while (true) {
            System.out.println("1. Show all Products");
            System.out.println("2. Sum of all Products in Stock");
            System.out.println("3. Add to Cart (by ID)");
            System.out.println("4. Show Cart");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shop.getProducts();
                    break;
                case 2:
                    System.out.println("Total Stock Value: $" + shop.getTotalStockValue());
                    break;
                case 3:
                    System.out.print("Enter product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    shop.addToCart(productId);
                    break;
                case 4:
                    System.out.println("Cart Total: $" + shop.getCartTotal());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
