package at.aaron_frick.swp.AufgabenKW5;

public class Laptop implements Product, HasLogo {
    private String name;
    private double price;
    private String Logo;

    public Laptop(String name, double price, String Logo) {
        this.name = name;
        this.price = price;
        this.Logo = Logo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getLogo() {
        return Logo;
    }
}
