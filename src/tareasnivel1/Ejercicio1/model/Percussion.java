package tareasnivel1.Ejercicio1.model;

public class Percussion extends Instrument {

    static {
        System.out.println("The percussion class has been loaded into memory");
    }

    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void Touch() {
        System.out.println("A percussion instrument is playing");
        System.out.println();
    }
}
