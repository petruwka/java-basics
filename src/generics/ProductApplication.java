package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Collections.singletonList;

public class ProductApplication {

    public static void main(String[] args) {

//        List<Product> products = new ArrayList<>();
//        products.add(new Product("TV", 100));
//
//        List<Product> products1 = singletonList(new Product("TV", 100));
//

        Product tv = new Product("TV", 1000);
        HasPrice discountedTV = new DiscountedProduct(tv);


        System.out.println(discountedTV.getPrice());

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 2000));
        products.add(new Product("laptop", 4000));
        products.add(new Product("car", 100_000));
        products.add(new Service(100_000, "asd"));

        List<Service> services = new ArrayList<>();

        System.out.println(products);

        Consumer<Product> processor = new Increase10PerProcesor();
        processElements(products, processor);
        System.out.println(products);

        processElements(products, new DecreaseBy100PRocessor());


//        List<Service> services = new ArrayList<>();
//        services.add(new Service(100, "repair of PC"));
//        services.add(new Service(1000, "build software"));
//
//        System.out.println(services);

    }

    private static <T extends Product> void processElements(List<T> list, Consumer<? super Product> processor) {
//        for (int i = 0; i < list.size(); i++) {
//            processor.accept(list.get(0));
//        }

//        for (Product product : list) {
//            processor.accept(product);
//        }

        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            processor.accept(product);

            if (product.getPrice() > 4000) {
                iterator.remove();
            }
        }


//        iterator.remove();

    }
}
