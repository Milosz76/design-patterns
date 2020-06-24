package pl.sdacademy.designpatterns.structural.adapter;

public class CatToDogAdapter implements Dog{
    private Cat cat; //kot przerabiany na psa

    public CatToDogAdapter(Cat cat) {
        this.cat = cat;
    }

    //klasa implementuje metody psa do kota

    @Override
    public void woof() {
        cat.meow(); //zbliżone zachowanie bo kot nie szczeka
    }

    @Override
    public void eat() {
        cat.eat();
    }
}
