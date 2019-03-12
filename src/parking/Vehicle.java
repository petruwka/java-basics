package parking;

public class Vehicle {
    private String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
