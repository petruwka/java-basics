package restraurant;

public class Restaurant {

    private Table[] tables = new Table[5];

    public void addTableOrder(Table table, int numberOfTable) throws RestaurantBusyException {
        if (numberOfTable > tables.length - 1) {
            throw new RestaurantBusyException();
        }

        tables[numberOfTable] = table;
    }

    public void printTables() {
        for (int i = 0; i < tables.length; i++) {
            Table t = tables[i];
            if (t != null) {
                System.out.println("Table " + (i + 1) + " " + t);
//                t.printOrders();
            }
        }
    }

}
