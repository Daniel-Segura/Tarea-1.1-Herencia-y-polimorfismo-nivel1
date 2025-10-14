package tareasnivel1.Ejercicio1.model;

public abstract class Instrument {
    protected String name;
    protected double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void Touch();
}
