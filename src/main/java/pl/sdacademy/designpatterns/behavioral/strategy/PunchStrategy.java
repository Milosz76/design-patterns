package pl.sdacademy.designpatterns.behavioral.strategy;

public class PunchStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Uderzenie pięścią");
    }
}
