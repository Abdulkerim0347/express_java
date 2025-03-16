package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
//        guessNum(100);

//        findMin();

        checkCredentials();
    }

    public static void guessNum(int bound) {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(bound);

        int input;
        do {
            System.out.print("Guess the number: ");
            input = scanner.nextInt();
            if (input > random) {
                System.out.println("Less");
            }
            else if (input == random) {
                System.out.println("Correct!");
                break;
            }
            else {
                System.out.println("More");
            }
        } while (input != random);
    }


    public static void findMin() {
        Scanner scanner = new Scanner(System.in);
        int input;
        int min = 2147483647;

        do {
            System.out.print("Enter number: ");
            input = scanner.nextInt();

            if (min > input && input >= 0) {
                min = input;
            }

        } while (input >= 0);

        System.out.println("The smallest number: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;

        do {
            System.out.print("Login: ");
            login = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Access granted!");





    }

}
