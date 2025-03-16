package practice_5.test5;

public abstract class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void serve();
    public abstract void description();
}
