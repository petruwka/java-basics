package list;

import java.util.Objects;

public class Fruit implements Comparable {
    public final String fruit;

    public Fruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("comparable with other: " + this + " " + o);

        // less than 0 -> in case THIS fruit is smaller than o
        // 0 - if objects are equal
        // positive - if Object o is smaller

        Fruit other = (Fruit) o;
        return fruit.compareTo(other.fruit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit1 = (Fruit) o;
        return Objects.equals(fruit, fruit1.fruit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruit='" + fruit + '\'' +
                '}';
    }
}
