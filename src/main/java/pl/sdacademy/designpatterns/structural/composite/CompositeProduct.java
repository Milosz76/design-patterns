package pl.sdacademy.designpatterns.structural.composite;
import java.util.Arrays;
import java.util.List;

public class CompositeProduct implements Product{
    //złożony produkt
    private List<Product> products;

    public CompositeProduct(Product ... products){ //dowolna ilosc produktów
        this.products = Arrays.asList(products);
    }

    @Override
    public double getPrice(){
        return products.stream()
                .mapToDouble(products -> products.getPrice())
                .sum();
    }

//    @Override
//    public double getPrice() {
//        return 0;
//    }
}
