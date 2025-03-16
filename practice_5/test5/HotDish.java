package practice_5.test5;

public class HotDish extends Dish {
    private double temperature; // in C
    public HotDish(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void serve() {
        System.out.println(getName() + " with temperature " + getTemperature() + " C is served!");
    }

    @Override
    public void description() {
        System.out.println("Name: " + getName() + ", temperature: " + getTemperature());
    }
}
