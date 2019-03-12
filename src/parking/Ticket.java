package parking;

import java.awt.*;

public class Ticket {
    private final String registrationNumber;
    private final int row;
    private final int slotInRow;

    public Ticket(String registrationNumber, int row, int slotInRow) {
        this.registrationNumber = registrationNumber;
        this.row = row;
        this.slotInRow = slotInRow;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getRow() {
        return row;
    }

    public int getSlotInRow() {
        return slotInRow;
    }

    @Override
    public String toString() {
        return "Ticket: Registration number=" + getRegistrationNumber();
    }
}
