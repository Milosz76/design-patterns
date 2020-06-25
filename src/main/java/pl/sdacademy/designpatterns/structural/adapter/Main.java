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
        //Dog dog = cat; //jak wiadomo taka instancja nie zadziała
        Dog dog = new CatToDogAdapter(cat); //jako argument przekazuje kota którego adaptuje na psa
        System.out.println("Pies je:");
        dog.eat();
        System.out.println("Pies szczeka - zmiana metody z kota na psa po \"przeróbce\" !!!!!:");
        dog.woof();
        System.out.println("Kot nie szczeka tylko miałczy:");
        cat.meow();
        System.out.println("Kot je:");
        cat.eat();
    }
}
