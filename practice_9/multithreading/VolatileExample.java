package practice_9.multithreading;

class RestaurantStatus {
    private volatile boolean open = true;

    public void closeRestaurant() {
        open = false;
        System.out.println("Restaurant is closed!");
    }

    public void work(String waiter) {
        while (open) {
            System.out.println(waiter + " is serving clients...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(waiter + " went home");
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        RestaurantStatus status = new RestaurantStatus();

        Thread waiter1 = new Thread(() -> status.work("Waiter 1"));
        waiter1.start();

        Thread.sleep(2000);
        status.closeRestaurant();
    }
}
