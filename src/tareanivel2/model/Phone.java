package tareanivel2.model;

public class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void call(String phoneNumber) {
        System.out.println("The number received by parameter is being called: " + phoneNumber);
    }
}