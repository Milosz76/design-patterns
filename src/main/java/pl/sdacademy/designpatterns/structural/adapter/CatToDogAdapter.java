package pl.sdacademy.designpatterns.structural.adapter;

public class CatToDogAdapter implements Dog{
    // Do pola będzie przypisany adaptowany obiekt.
    private Cat cat; //kot przerabiany na psa

    // Przypiszemy go do pola za pomocą konstruktora.
    public CatToDogAdapter(Cat cat) {
        this.cat = cat;
    }

    //klasa implementuje metody psa do kota

    // Adaptujemy naszego kota na psa. Metoda Jedzenie będzie wyglądało analogicznie.
    @Override
    public void woof() {
        // Nasz kot zamiauczy, kiedy będziemy od niego wymagali szczekania.
        cat.meow(); //zbliżone zachowanie bo kot nie szczeka
    }


    @Override
    public void eat() {
        cat.eat();
    }
}
