package tareanivel2.model;

public class Cell {
    protected String brand;
    protected String model;

    public Cell(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void call(String cellNumber) {
        System.out.println("The number received by parameter is being called: " + cellNumber);
    }
}