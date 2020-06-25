package pl.sdacademy.designpatterns.structural.composite;

//struktura drzewiasta wiki - Composite pattern

public class Main {
    public static void main(String [] args){
        CocaColaCan coke = new CocaColaCan();
        Snickers snickers = new Snickers();

        CompositeProduct compositeProduct = new CompositeProduct(coke,snickers);
        System.out.println(compositeProduct.getPrice());

        System.out.println("Tworzę paczkę produktów, czyli 1 snickers + 2 puszki coke");
        CompositeProduct compositeProduct2 = new CompositeProduct(compositeProduct, coke); //tworze paczkę produktów
        System.out.println(compositeProduct2.getPrice());

    }
}
