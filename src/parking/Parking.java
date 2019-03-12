package parking;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Parking {

    /**
     * slots (2rows and 3 slotsInRow:
     * row 0: [0 => null,1 => null,2 => null]
     * row 1: [0 => null,1 => null,2 => null]
     *
     */
    private Vehicle[][] slots;

    public Parking(int rows, int slotsInRow) {
        this.slots = new Vehicle[rows][slotsInRow];
    }

    public Ticket parkVehicle(Vehicle vehicle) throws NoParkingSlotsException {
        for (int i = 0; i < this.slots.length; i++) {
            for (int j = 0; j < this.slots[i].length; j++) {
                if (this.slots[i][j] == null) {
                    // row = i
                    // slot = j
                    this.slots[i][j] = vehicle;
                    return new Ticket(vehicle.getRegistrationNumber(), i, j);
                }
            }
        }
        throw new NoParkingSlotsException();
    }

    public Vehicle getVehicle(Ticket ticket) {
        int row = ticket.getRow();
        int slot = ticket.getSlotInRow();

        Vehicle vehicle = this.slots[row][slot];

        // TODO: check if null => then throw TicketInvalidException
        // TODO: check if vehicle registrationNumber is equals to ticket registartionNumber => if no then throw TicketInvalidException

        this.slots[row][slot] = null;

        return vehicle;
    }

    public int getAvailableSlots() {
        int count = 0;
        for (int i = 0; i < this.slots.length; i++) {
            for (int j = 0; j < this.slots[i].length; j++) {
                if (this.slots[i][j] == null) {
                    count++;
                }
            }
        }

        return count;
    }

}
