package generics;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {

    private List<T> numbers;

    public NumberBox() {
        numbers = new ArrayList<>();
    }

    public void add(T num) {
        numbers.add(num);
    }

    public double getSum() {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }

        return sum;
    }

    public static double computeSum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Numbers are added successfully!");
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println("Updated list: " + integerList);
    }
}
