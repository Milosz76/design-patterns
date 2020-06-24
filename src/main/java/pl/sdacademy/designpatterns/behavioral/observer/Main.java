package pl.sdacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main(String [] args){
        PressPublisher publisher = new PressPublisher("Globe");
        //zanim wydawca wyda tekst to dodaje press readera
        PressReader pressReader = new PressReader("Dariusz Dariuszowki");
        publisher.addObserver(pressReader);

        publisher.publish("Znaleziono ślady życia na marsie!");
        //jakieś obiekty poinformują że coś wydał
        //interface obserwator prasy

        Billboard billboard = new Billboard();
        publisher.addObserver(billboard);
        publisher.publish("Mecz między X i Y zakończył się remisem");

    }
}
