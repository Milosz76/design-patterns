package pl.sdacademy.designpatterns.creational.singleton;

public enum UniverseV1 {
    // Przykład singletona w różnym wydaniu.
    // https://pl.wikipedia.org/wiki/Singleton_(wzorzec_projektowy)
    // Singleton to sposób na uzyskanie tylko jednej instancji danej klasy.
    INSTANCE;
    private double mass;
    private double avgTemperature;

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
