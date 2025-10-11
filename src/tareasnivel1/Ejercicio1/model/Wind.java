package tareasnivel1.Ejercicio1.model;

public class Wind extends Instrument {

    static {
        System.out.println("The wind class has been loaded into memory");
    }

    public Wind(String name, double price) {
        super(name, price);
    }

    @Override
    public void Touch() {
        System.out.println("A wind instrument is playing");
        System.out.println();
    }

    public static void StaticWindMethod() {
        System.out.println("Static method of the wind class");
    }


}
