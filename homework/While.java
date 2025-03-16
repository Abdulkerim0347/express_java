package homework;

import java.util.Scanner;

public class While {
        // 3! = 3*2*1
    // 6! = 6*5*4*3*2*1

    public static void calcFactorial(double factorial) {
        double result = 1;
        while (factorial > 0) {
            result *= factorial; // result = result * factorial;
            factorial--; // factorial - 1
        }

        System.out.println("Result: " + result);
    }

    public static void printEven(int num) {
        int even = 0;
        while (num > even) {
            even += 2;
            System.out.print(even + " ");
        }
    }

    public static void printCountdown(int num) {
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        printCountdown(input);
    }

}
