package pl.sdacademy.designpatterns.creational.singleton;

public class UniverseV3 {
    private static UniverseV3 instance; //tworzę stałą ?
    private double mass;
    private double avgTemperature;

    // Getter dla pola instance

    public static UniverseV3 getInstance() {
        // "Sprawdzi", czy polu przypisana jest już wartość.
        if (instance == null) {
            // Jeśli nie, to ją zainicjalizuje.
            instance = new UniverseV3();
        }
        return instance;
    }
    private UniverseV3() {} //konstruktor bezargumentowy
//
//    /*
//    Dzięki temu moge tylko tutaj wywoływać ten get, przypisałe wartość null i żadną inną
//    Uwaga
//    dla wielowątkowości to rozwiązanie nie będzie dobre jak np z Class Bench
//
//     */
//    //-----------------------------


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
