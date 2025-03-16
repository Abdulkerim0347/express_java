package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {

    public static void main(String[] args) {
//        print10();

//        commandReader();

//        sumOfDigits(1234);

    }

    public static void print10() {
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Prompt command: ");
            command = scanner.nextLine();
        }
        System.out.println("Program terminated!");
    }

    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
