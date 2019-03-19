package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ProductApplication {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 2000));
        products.add(new Product("laptop", 4000));
        products.add(new Product("car", 100_000));
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

    private static void processElements(List<Product> list, Consumer<Product> processor) {
//        for (int i = 0; i < list.size(); i++) {
//            processor.accept(list.get(0));
//        }

//        for (Product product : list) {
//            processor.accept(product);
//        }

        Iterator<Product> iterator = list.iterator();
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
