package generics;

import java.util.function.Consumer;

public class Increase10PerProcesor implements Consumer<Product> {
    @Override
    public void accept(Product product) {

        double oldPrice = product.getPrice();
        double newPrice = oldPrice * 1.1;

        product.setPrice(newPrice);

    }
}
