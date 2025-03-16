package practice_9.multithreading;

class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public synchronized void use(Resource other) {
        System.out.println(Thread.currentThread().getName() + " holds " + name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
        synchronized (other) {
            System.out.println(Thread.currentThread().getName() + " uses " + other.name);
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource tray = new Resource("tray");
        Resource bill = new Resource("bill");

        Thread waiter1 = new Thread(() -> tray.use(bill),"Waiter 1");
        Thread waiter2 = new Thread(() -> bill.use(tray),"Waiter 2");

        waiter1.start();
        waiter2.start();
    }
}
