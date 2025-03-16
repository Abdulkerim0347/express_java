package practice_4.solvers;

public class ForTaskSolver {

    public static void main(String[] args) {
//        multTable(5);

//        sumN(10);

//        System.out.println(isPrime(41));

//        printPrimeTill100();
    }




    public static void multTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
            System.out.println("Sum from 1 to " + n + ": " + sum);
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void printPrimeTill100() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
}
