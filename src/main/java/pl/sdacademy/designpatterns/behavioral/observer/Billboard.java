package pl.sdacademy.designpatterns.behavioral.observer;

public class Billboard implements PressObserver{
    private String text; //text mówi co ma wyświetlać na billboard

    @Override
    public void update(String paper) {
        System.out.println("Z billboard zdejmowany jest tekst: " + text + " , od teraz wyświetlane jest: "
                + (text = paper.substring(0,10))); //tekst jest zwracany od text po zmianie
    }
}
