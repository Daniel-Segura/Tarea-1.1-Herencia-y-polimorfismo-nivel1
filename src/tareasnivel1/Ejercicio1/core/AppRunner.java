package tareasnivel1.Ejercicio1.core;


import tareasnivel1.Ejercicio1.model.Instrument;
import tareasnivel1.Ejercicio1.model.Percussion;
import tareasnivel1.Ejercicio1.model.Rope;
import tareasnivel1.Ejercicio1.model.Wind;

public class AppRunner {
    public void executor() {
        System.out.println();
        System.out.println("We access the static method of the wind class");
        System.out.println();
        Wind.staticWindMethod();


        Instrument wind = new Wind("Trumpet", 200.0);
        wind.touch();

        Instrument percussion = new Percussion("Congas", 75.0);
        percussion.touch();

        Instrument rope = new Rope("Guitar", 120.0);
        rope.touch();

    }
}
