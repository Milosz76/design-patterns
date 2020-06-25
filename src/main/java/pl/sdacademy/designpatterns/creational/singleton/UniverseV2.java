package pl.sdacademy.designpatterns.creational.singleton;

public class UniverseV2 {
        private static UniverseV2 instance = new UniverseV2();
        private double mass;
        private double avgTemperature;

        private UniverseV2(){} //konstruktor prywatny i bezparametrowy

//    //tylko get dzięki temu jest Singleton bez set
//        //------------------------------------------

//        private UniverseV2 (double mass, double avgTemperature) {
//            //^^^^^konstruktor prywatny, czyli można wywołać w ciele tej klasy
//            this.mass = mass;
//            this.avgTemperature = avgTemperature;
//        }

    public static UniverseV2 getInstance() {
        return instance;
    }

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
