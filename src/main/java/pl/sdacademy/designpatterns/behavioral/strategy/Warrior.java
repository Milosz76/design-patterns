package pl.sdacademy.designpatterns.behavioral.strategy;

public class Warrior {
    private String name;
    //niech wojownik ma pole hitStrategy
    private HitStrategy hitStrategy; // alt + enter i dodaj do konstruktora

    public Warrior(String name, HitStrategy hitStrategy) {
        this.name = name;
        this.hitStrategy = hitStrategy;
    }

    public String getName() {
        return name;
    }

    //dodajemy set do pola hitStrategy po implementacji hitStrategy.hit();

    public void setHitStrategy(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }

    //metoda dodatkowa, metoda ataku kiedy wojownik ma uderzać
    public void hit(){
        //System.out.println("Wojownik udarza!");
        //wywołujemy implementacje jakie ustawiliśmy
        // wykorzysta do tego przypisaną jemu strategię uderzania.
        hitStrategy.hit();
    }
}
