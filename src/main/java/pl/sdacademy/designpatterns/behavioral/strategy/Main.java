package pl.sdacademy.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String [] args){
        Warrior warrior = new Warrior("ABC", new PunchStrategy()); //dodajemy do konstruktora PunchStrategy
        warrior.hit();
        warrior.setHitStrategy(new SwordSwingStrategy()); //zmieniamy wartość pola przez set. Wojownik inaczej realizuje funkjonalność !!!
        //podmienilismy metody naszego wojownika
        warrior.hit();
        warrior.setHitStrategy(() -> System.out.println("customowy sposób uderzenia")); //podmieniamy sposoby uderzania w trakcie działania aplikacji
        warrior.hit();
    }
}
