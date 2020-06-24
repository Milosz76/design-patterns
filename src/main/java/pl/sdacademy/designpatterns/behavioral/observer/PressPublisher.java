package pl.sdacademy.designpatterns.behavioral.observer;
import java.util.HashSet;
import java.util.Set;

public class PressPublisher {
    private String name;
    private Set<PressObserver> observers = new HashSet<>(); //zbiór obserwatorów prasy. pusty zbiór

    public void publish(String paper){
        System.out.println("Wydawca wydaje: " + name + " wydaje: "+ paper);
        observers.forEach(observer -> observer.update(paper));
    }

    public PressPublisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //metoda publiczna dodaj obserwatora, czytelnika
    public void addObserver(PressObserver observer){
        observers.add(observer); //observer jako arg którego dostaliśmy
    }

}
