package at.aaron_frick.swp.AufgabenKW3.Vormittag.Aufgabe1;

class Clownfish extends Fish {
    private String colorPattern;


    public Clownfish(String name, double size, String colorPattern) {
        super(name, size);
        this.colorPattern = colorPattern;
    }

    @Override
    public void swim() {
        System.out.println(name + " schwimmt verspielt, wie ein Clownfisch.");
    }
}