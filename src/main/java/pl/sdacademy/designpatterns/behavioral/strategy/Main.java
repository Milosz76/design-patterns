package pl.sdacademy.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String [] args){
        // Wzorzec strategii
        // https://pl.wikipedia.org/wiki/Strategia_(wzorzec_projektowy)

        // Używamy wtedy, gdy wyodrębnić do osobnych typów sposoby implementacji wybranej metody.
        // W naszym przykładzie chcemy móc tworzyć wojowników, którzy uderzają na różne sposoby
        // Jako drugi argument konstruktora przekażemy strategię uderzania (uderzenie pięścią).
        Warrior warrior = new Warrior("ABC", new PunchStrategy()); //dodajemy do konstruktora PunchStrategy
        warrior.hit();
        warrior.setHitStrategy(new SwordSwingStrategy()); //zmieniamy wartość pola przez set. Wojownik inaczej realizuje funkjonalność !!!
        //podmienilismy metody naszego wojownika
        warrior.hit();
        //vvvv podmieniamy sposoby uderzania w trakcie działania aplikacji
        warrior.setHitStrategy(() -> System.out.println("customowy sposób uderzenia"));
        warrior.hit();
    }
}
