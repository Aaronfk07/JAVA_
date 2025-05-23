package at.aaron_frick.swp.Amazon;

import at.aaron_frick.swp.Amazon.gui.GUI1;
import at.aaron_frick.swp.Amazon.products.Shoes;
import at.aaron_frick.swp.Amazon.shops.Amazon;
import at.aaron_frick.swp.Amazon.shops.Shop;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Amazon();
        shop.addProduct(new Shoes(1,"teslik",30,"today i like tomorrow","red"));

        GUI1 gui1 = new GUI1(shop);


        gui1.start();
        // Uncomment the following line to use ConsoleGUI2 instead
        // ConsoleGUI2 gui2 = new ConsoleGUI2();
        // gui2.start();
    }
}
