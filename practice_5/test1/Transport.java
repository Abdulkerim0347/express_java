package practice_5.test1;

public abstract class Transport {
    private int capacity;
    private double speed;

    public Transport(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getSpeed() {
        return speed;
    }

    abstract void start();
}
