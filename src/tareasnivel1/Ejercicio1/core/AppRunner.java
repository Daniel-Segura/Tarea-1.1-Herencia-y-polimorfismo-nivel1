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
        Wind.StaticWindMethod();


        Instrument myinstrumentwind = new Wind("trumpet", 200.0);
        myinstrumentwind.Touch();

        Instrument myinstrumentpercussion = new Percussion("congas", 75.0);
        myinstrumentpercussion.Touch(); // provoca la carga de la clase percusión.

        Instrument myinstrumentrope = new Rope("Guitar", 120.0);
        myinstrumentrope.Touch();

    }
}
