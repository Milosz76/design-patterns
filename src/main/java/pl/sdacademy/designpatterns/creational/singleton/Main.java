package pl.sdacademy.designpatterns.creational.singleton;

public class Main {
    public static void main(String [] args){
        // Przykład singletona w różnym wydaniu.
        // https://pl.wikipedia.org/wiki/Singleton_(wzorzec_projektowy)
        // Singleton to sposób na uzyskanie tylko jednej instancji danej klasy.
        UniverseV1 universeV1 = UniverseV1.INSTANCE;
        UniverseV2 universeV2 = UniverseV2.getInstance();
        UniverseV3 universeV3 = UniverseV3.getInstance();
        UniverseV4 universeV4 = UniverseV4.getInstance();

        System.out.println(universeV3 == UniverseV3.getInstance());
        System.out.println(universeV4 == UniverseV4.getInstance());
    }
}
