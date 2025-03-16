package practice_4.solvers;

public class IfElseTaskSolver {

    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isEven(6));

        System.out.println(checkAge(61));
        System.out.println(checkAge(17));
        System.out.println(checkAge(23));

        System.out.println(findMax(100,-32,0));
    }

    public static String isEven(int num) {
        String result = "Odd";
        if (num % 2 == 0) {
            result = "Even";
        }

        return result;
    }

    public static String checkAge(int age) {
        String result = "";
        if (age < 18) {
            result = "Juvenile";
        }

        if (age >= 18 && age <= 60) {
            result = "Adult";
        }

        if (age > 60) {
            result = "Aged";
        }

        return result;
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        return max;

    }

}
