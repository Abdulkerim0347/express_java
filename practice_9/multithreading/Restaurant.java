package practice_9.multithreading;

class Waiter extends Thread {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " serves guests...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished serving!");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Waiter waiter1 = new Waiter("Waiter 1");
        waiter1.start();
    }
}
