package practice_9.multithreading;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Your order is ready!";
        };

        Future<String> future = executor.submit(task);
        System.out.println("Waiting for the order...");
        System.out.println(future.get());

        executor.shutdown();
    }
}
