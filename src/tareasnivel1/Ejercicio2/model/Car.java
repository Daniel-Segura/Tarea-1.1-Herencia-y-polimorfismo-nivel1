package tareasnivel1.Ejercicio2.model;

public class Car {
    public static final String BRAND = "Audi";
    private static String model;
    private final int power;

    public Car(int power) {
        this.power = power;
    }


    public static void setModel(String model) {
        Car.model = model;
    }

    public void showModel() {
        System.out.println("The model of car is " + model);
    }

    public void showPower() {
        System.out.println("The power of car is: " + power + " horsepower");
    }

    public static void brake() {
        System.out.println("The car is breaking");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    public String showInfo() {
        return "Car Info: \n" +
                "*Brand: " + BRAND + "\n" +
                "*Model: " + model + "\n" +
                "*Power: " + power + " HP";
    }
}


