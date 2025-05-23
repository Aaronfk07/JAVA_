package at.aaron_frick.swp.Amazon.products;

public class MobilePhones implements Product {
    private int id;
    private float price;
    private String title;
    private String description;

    public MobilePhones(int id, String title, float price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }



    public void call(String number) {

        System.out.println("Calling " + number + "...");
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
