package practice_5.test1;

public class Car extends Transport{

    public Car() {
        super(4, 70);
    }

    @Override
    public void start() {
        System.out.println("Car drove off");
    }
}
