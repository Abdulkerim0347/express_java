package livecoding;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();
        int peopleToTransport = 2;

        manager.printAvailableVehicles(peopleToTransport);
    }
}
