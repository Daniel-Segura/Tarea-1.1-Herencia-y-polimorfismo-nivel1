package tareasnivel1.Ejercicio1.model;

public class Wind extends Instrument {

    static {
        System.out.println("The wind class has been loaded into memory");
    }

    public Wind(String name, double price) {
        super(name, price);
    }

    @Override
    public void touch() {
        System.out.println("A wind instrument is playing: " + getName() + " The price is: " + "$" + getPrice());
        System.out.println();
    }

    public static void staticWindMethod() {
        System.out.println("Static method of the wind class");
    }


}
