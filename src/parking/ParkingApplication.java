package parking;

public class ParkingApplication {

    public static void main(String[] args) {
        Parking parking = new Parking(10, 10);

        Vehicle mazda3 = new Vehicle("DW6J777");
        try {
            for (int i=0; i < 101; i ++ ) {
                parking.parkVehicle(mazda3);
            }
            Ticket ticket = parking.parkVehicle(mazda3);
            System.out.println(ticket);

            System.out.println(parking.getAvailableSlots());

            Vehicle vehicle = parking.getVehicle(ticket);
            System.out.println("Vehicle from Parking: " + vehicle);

        } catch (NoParkingSlotsException e) {
            System.out.println("Sorry, the parking is busy...");
        }

        System.out.println(parking.getAvailableSlots());
    }
}
