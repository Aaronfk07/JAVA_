package at.aaron_frick.swp.Amazon.products;

public class Shoes implements Product {
    private int id;
    private float price;
    private String title;
    private String description;
    private String color;

    public Shoes(int id, String title, float price, String description, String color) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.color = color;
    }

    public int getID() { return id; }
    public float getPrice() { return price; }
    public String getTitle() { return title; }
    public String getDescription() { return description + ", Color: " + color; }
}
