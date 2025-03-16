package homework;

import java.util.Scanner;

public class For {

    // 6
    // 6 * 1 = 6
    // 6 * 2 = 12
    // ...
    // 6 * 10 = 60

    public static void multTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        multTable(n);
    }
}
