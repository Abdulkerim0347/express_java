package practice_5.test1;

public class Plane extends Transport {
    public Plane() {
        super(150, 10000);
    }

    @Override
    public void start() {
        System.out.println("Plane took off");
    }
}
