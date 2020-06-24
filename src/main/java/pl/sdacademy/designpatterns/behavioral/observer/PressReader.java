package pl.sdacademy.designpatterns.behavioral.observer;
//czytelnik obserwuje obserwatora

public class PressReader implements PressObserver{
    private String fullName; //jakiś czytelnik

    public PressReader(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void update(String paper) {
        System.out.println("Czytelnik: " + fullName + " odczytuje " + paper);
        //dla każdego obserwatora doda obserwatora

    }
}
