package practice_9.multithreading;

class OrderBook {
    private int orderNumber;

    public synchronized void takeOrder(String waiter) {
        orderNumber++;
        System.out.println(waiter + " took order №" + orderNumber);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        OrderBook book = new OrderBook();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                book.takeOrder(Thread.currentThread().getName());
            }
        };

        Thread waiter1 = new Thread(task,"Waiter 1");
        Thread waiter2 = new Thread(task,"Waiter 2");

        waiter1.start();
        waiter2.start();

    }
}