package practice_5.test1;

public class Ship extends Transport {

    public Ship() {
        super(5000, 50);
    }

    @Override
    public void start() {
        System.out.println("Ship sailed");
    }
}
