package at.aaron_frick.swp.AufgabenKW5;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private  List<Product> products = new ArrayList<>();
    private  List<Product> cart = new ArrayList<>();
    private  List<HasLogo> productsWithLogo = new ArrayList<>();

    public Shop() {
        products.add(new Book("Java Programming", 29.99));
        products.add(new Book("Rust Programming", 19.99));
        products.add(new Book("How to make money online fast", 39.99));

        Laptop Laptop1 = new Laptop("Lenovo Thinkpad 2020", 1399.99,"Lenovo Logo");
        Laptop Laptop2 = new Laptop("Dell XPS 15", 1099.99,"Dell Logo");
        Laptop Laptop3 = new Laptop("Apple Macbook Pro", 1999.99,"Apple Logo");

        products.add(Laptop1);
        productsWithLogo.add(Laptop1);

        products.add(Laptop2);
        productsWithLogo.add(Laptop2);

        products.add(Laptop3);
        productsWithLogo.add(Laptop3);

        Phone Phone1 = new Phone("IPhone 13", 899.99,"Apple Logo");
        Phone Phone2 = new Phone("IPhone 14", 1119.99,"Apple Logo");
        Phone Phone3 = new Phone("IPhone 15", 1399.99,"Apple Logo");

        products.add(Phone1);
        productsWithLogo.add(Phone1);

        products.add(Phone2);
        productsWithLogo.add(Phone2);

        products.add(Phone3);
        productsWithLogo.add(Phone3);
    }

    public void showProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + ". " + products.get(i).getName() + " - $" + products.get(i).getPrice());
        }
    }

    public double getTotalStockValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void addToCart(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.add(product);
                System.out.println(product.getName() + " added to cart.");
                return;
             }
        }
        System.out.println("Product not found");
    }

    public double getCartTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }
    public void showProductsWithLogo() {
        System.out.println("Products With Logo");
        for (HasLogo p: productsWithLogo ) {
            System.out.println(p.getLogo() + " - " + p.getName());
        }
    }
}
