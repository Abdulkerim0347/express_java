package practice_9.multithreading;

public class MultithreadedRestaurant {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            new Waiter("Waiter " + i).start();
        }
    }
}
