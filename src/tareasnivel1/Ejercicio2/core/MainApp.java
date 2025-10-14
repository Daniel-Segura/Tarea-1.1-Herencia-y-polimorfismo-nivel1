package tareasnivel1.Ejercicio2.core;

import tareasnivel1.Ejercicio2.model.Car;

public class MainApp {
    public void executor() {

        Car.setModel(" A8");
        Car myCar1 = new Car(286);

        myCar1.showPower();
        myCar1.showModel();


        myCar1.acelerar();
        Car.frenar();

        System.out.println(myCar1.showInfo());
    }
}
