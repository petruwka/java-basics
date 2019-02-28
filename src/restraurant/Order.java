package restraurant;

import java.util.Objects;

public class Order {
    private String dish;
    private int numberOfDishes;

    public Order(String dish, int numberOfDishes) {
        this.dish = dish;
        this.numberOfDishes = numberOfDishes;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOfDishes == order.numberOfDishes &&
                Objects.equals(dish, order.dish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, numberOfDishes);
    }

    @Override
    public String toString() {
        // Ice creem (2)
        return dish + "(" + numberOfDishes + ")";

    }
}
