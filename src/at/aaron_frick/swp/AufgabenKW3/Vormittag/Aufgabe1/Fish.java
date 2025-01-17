package at.aaron_frick.swp.AufgabenKW3.Vormittag.Aufgabe1;



class Fish {
    protected String name;
    protected double size;


    public Fish(String name, double size) {
        this.name = name;
        this.size = size;
    }


    public void swim() {
        System.out.println(name + " schwimmt.");
    }


    public void describe() {
        System.out.println(name + " ist " + size + " cm groß.");
    }
}


