package practice_9.deadlock;

import java.io.File;

public class DeadlockFree {
    private static final File firstFile = new File(DeadlockFree.class.getClassLoader().getResource("1.txt").getFile());
    private static final File secondFile = new File(DeadlockFree.class.getClassLoader().getResource("2.txt").getFile());

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (firstFile) {
                System.out.println("Thread 1 locked file 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (secondFile) {
                    System.out.println("Thread 1 locked file 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (firstFile) {
                System.out.println("Thread 2 locked file 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (secondFile) {
                    System.out.println("Thread 2 locked file 2");
                }
            }
        });


        t1.start();
        t2.start();

    }
}
