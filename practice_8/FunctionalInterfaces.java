package practice_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // old analogy of lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
//        r1.run();

        // lambda expression
        Runnable r2 = () -> System.out.println("Hello world!");
//        r2.run();


        MathOperations add = (a,b) -> a+b;
//        System.out.println(add.operate(3,5));

        Predicate<Integer> isMoreThanFive = x -> x > 5;
//        System.out.println(isMoreThanFive.test(1));
//        System.out.println(isMoreThanFive.test(7));

        Function<String,Integer> getLength = str -> str.length();
//        System.out.println(getLength.apply("abc"));

        Consumer<String> printer = System.out::println;
//        printer.accept("Hello world!");

        Supplier<Double> random = Math::random;
//        System.out.println(random.get());




    }
}
