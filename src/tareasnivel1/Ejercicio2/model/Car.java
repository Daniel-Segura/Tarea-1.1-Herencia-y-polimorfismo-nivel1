package tareasnivel1.Ejercicio2.model;

public class Car {
    public static final String brand = "Audi";
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

    public static void frenar() {
        System.out.println("The car is breaking");
    }

    public void acelerar() {
        System.out.println("The car is accelerating");
    }

    public String showInfo() {
        return "Car: \n*" + brand + "\n*model" + model + "\n*power " + power + " HP";
    }
}


