package pl.sdacademy.designpatterns.creational.singleton;
//
public class UniverseV4 {
   //----------------
    private static UniverseV4 instance;

    private double mass;
    private double avgTemperature;

    public static UniverseV4 getInstance() { //metoda jest zsynchonizowana bo jeden wątek na raz wywołuje tę motodę
        //^^^ jeden problem jesli metoda jest sync to spr czy klucz jest i wykonuje ponowne sprawdzenia i jest to zasobozerny proces
        //zostawiamy bez sync

        if(instance == null){
            synchronized (UniverseV4.class){ // synchronizuje blok póki klucz nie zostanie zdjęty - jeden blok kodu jest synchronizowany
            //^^^ ta wersja jest zabezpieczeniem dla wielowątkowości !!!!

                if(instance == null) { //dla tego watku wymagamy synchronizacji
                instance = new UniverseV4();
                }
            }
        }
        return instance;
    }

    UniverseV4 () { //konstruktor bezagrumentowy
    }

//    private UniverseV4(){} //prywatny konstruktor !!!!!
//    //-----------------
    
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}
