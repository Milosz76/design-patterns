package pl.sdacademy.designpatterns.behavioral.strategy;

//zamiast instrukcji if w metodzie hit()
// Strategia uderzania. Obiekty implementujące ten interfejs będą reprezentowały konkretny sposób
// uderzania.
public interface HitStrategy {
    void hit(); //metoda abstract
}
