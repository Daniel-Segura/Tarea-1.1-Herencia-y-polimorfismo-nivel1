package tareanivel2.model;

public class Smartphone extends Cell implements camera, watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photograph() {
        System.out.println("he is taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("the alarm is ringing");
    }
}