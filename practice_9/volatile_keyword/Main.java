package practice_9.volatile_keyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StatusChecker statusChecker = new StatusChecker();
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(statusChecker);

        t1.start();
        Thread.sleep(500);
        statusChecker.stop();

        Thread t2 = new Thread(statusChecker::stop);
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();

        System.out.println("Time with volatile: " + (end - start));
    }
}
