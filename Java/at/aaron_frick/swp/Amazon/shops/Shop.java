package at.aaron_frick.swp.Amazon.shops;

import at.aaron_frick.swp.Amazon.products.Product;

import java.util.List;

public interface Shop {
    public double getTotalStockValue();
    public void addToCart(int productId);
    public double getCartTotal();
    public List<Product> getProducts();
    public List<Product> getCart();
    public void addProduct(Product product);
}
