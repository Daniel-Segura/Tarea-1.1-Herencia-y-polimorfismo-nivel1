package tareanivel2.model;

public class Smartphone extends Phone implements camera, watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("he is taking a photo");
    }

    @Override
    public void soundAlarm() {
        System.out.println("the alarm is ringing");
    }
}