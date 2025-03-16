package practice_5.test5;

public class Drink extends Dish {
    private double volume; // in ml
    public Drink(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void serve() {
        System.out.println(getName() + " with volume " + getVolume() + " ml is served!");
    }

    @Override
    public void description() {
        System.out.println("Name: " + getName() + ", volume: " + getVolume());
    }
}
