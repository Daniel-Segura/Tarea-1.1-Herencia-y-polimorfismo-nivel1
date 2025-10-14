package tareanivel2.core;

import tareanivel2.model.Smartphone;

public class App {
    public void executor() {
        Smartphone phone = new Smartphone("Oppo", "Find X3 pro");

        Smartphone.call("658123409");

        phone.photograph();
        phone.alarm();
    }
}