package pl.sdacademy.designpatterns.structural.adapter;

public class Main {
    public static void main(String [] args){
        Cat cat = new NevaMasqueradeCat(); //nowa instacja implementacja kota
        //teraz chce użyć psa
        //chce jako kota użyć psa
        /*
        jak by z zewnątrz przyszedł do nas ten interface.
        Musimy zaadoptować tego psa jako kota
         */
        //Dog dog = cat;
        Dog dog = new CatToDogAdapter(cat); //jako argument przekazuje kota którego adaptuje na psa
        dog.eat();
        dog.woof();
    }
}
