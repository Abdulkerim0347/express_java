package practice_9.callable_future;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> dnaResult = () -> {
            System.out.println("Complex DNA calculation...");
            Thread.sleep(10000);
            return new Random().nextInt();
        };

        Future<Integer> future = executorService.submit(dnaResult);

        System.out.println("Result of DNA: " + future.get());

        executorService.shutdown();
    }
}
