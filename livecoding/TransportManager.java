package livecoding;

import java.util.ArrayList;
import java.util.List;

public class TransportManager {
    private List<Vehicle> vehicles;

    public TransportManager() {
        vehicles = new ArrayList<>();
        vehicles.add(new Car(4, "Toyota", "Corolla"));
        vehicles.add(new Car(4, "Honda", "Civic"));
        vehicles.add(new Car(2, "Ford", "Mustang"));
        vehicles.add(new Car(5, "Chevrolet", "Malibu"));
        vehicles.add(new Bus(50, "Volvo", "CityBus"));
        vehicles.add(new Bus(40, "Mercedes", "Sprinter Bus"));
        vehicles.add(new Bus(60, "Scania", "Intercity Bus"));
        vehicles.add(new Bus(30, "MAN", "Bus Express"));
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles(int capacity) {
        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getCapacity() >= capacity) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void printAvailableVehicles(int capacity) {
        List<Vehicle> availableVehicles = getAvailableVehicles(capacity);

        if (availableVehicles.isEmpty()) {
            System.out.println("No vehicles available for " + capacity + " people");
        } else {
            System.out.println("Available vehicles for " + capacity + " people:");
            availableVehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
        }
    }
}
