package tareasnivel1.Ejercicio1.model;

public abstract class Instrument {
    private final String name;
    private final double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void touch();
}
