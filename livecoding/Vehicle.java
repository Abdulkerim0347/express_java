package livecoding;

// transport company two types of vehicles (capacity, model, name)
// bus
// car
// functionality (transporting + capacity people)
// transport manager (return list of available vehicles)


public abstract class Vehicle {
    private int capacity;
    private String model;
    private String name;

    public Vehicle(int capacity, String model, String name) {
        this.capacity = capacity;
        this.model = model;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public void vehicleDrive() {
        System.out.println(name + " transporting " + this.capacity + " people");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(Model: " + model + ", Name: " + name + ", Capacity: " + capacity + ")";
    }
}
