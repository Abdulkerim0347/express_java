package homework;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int input;
        int x = 1;

        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 10);

//        System.out.println("The program terminated");
    }
}
