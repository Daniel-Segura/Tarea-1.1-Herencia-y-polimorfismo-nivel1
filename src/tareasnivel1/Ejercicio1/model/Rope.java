package tareasnivel1.Ejercicio1.model;

public class Rope extends Instrument {

    static {
        System.out.println("The string class has been loaded into memory");
    }

    public Rope(String name, double price) {
        super(name, price);
    }

    @Override
    public void Touch() {
        System.out.println("A rope instrument is playing");
        System.out.println();
    }
}
