package generics;

public class Service implements HasPrice {

    private double price;
    private String name;

    public Service(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
