package practice_9.multithreading;

public class SafeCounter {
    private int count;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized void decrement() {
        this.count--;
    }

    public synchronized int getCount() {
        return this.count;
    }
}
