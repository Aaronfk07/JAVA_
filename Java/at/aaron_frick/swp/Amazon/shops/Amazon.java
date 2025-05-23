package at.aaron_frick.swp.Amazon.shops;

import at.aaron_frick.swp.Amazon.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Shop {
    private List<Product> products = new ArrayList<>();
    private List<Product> cart = new ArrayList<>();



    public void showProducts() {
        System.out.println("Available Products:");
        for (Product p : products) {
            System.out.println(p.getID() + ". " + p.getTitle() + " - $" + p.getPrice());
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getCart() {
        return cart;
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }



    public double getTotalStockValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void addToCart(int productId) {
        for (Product p : products) {
            if (p.getID() == productId) {
                cart.add(p);
                System.out.println(p.getTitle() + " added to cart.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public double getCartTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }
}
