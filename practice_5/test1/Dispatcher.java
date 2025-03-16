package practice_5.test1;

public class Dispatcher {
    public void control(Transport transport) {
        transport.start();
    }

    public void printTransportDetails(Transport transport) {
        System.out.println("Speed: " + transport.getSpeed() + ", capacity: " + transport.getCapacity() + "\n");
    }
}
