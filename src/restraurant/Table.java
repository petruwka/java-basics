package restraurant;

import java.util.Arrays;

public class Table {

    private Order[] orders;

    public Table(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Table{" +
                "orders=" + Arrays.toString(orders) +
                '}';
    }

    //    public void printOrders() {
//        for (Order o : orders) {
//            System.out.println("Table order: " + o.getDish());
//        }
//    }




}
