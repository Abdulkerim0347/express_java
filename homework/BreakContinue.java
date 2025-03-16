package homework;

import java.util.Scanner;

public class BreakContinue {


    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        for (; ;) {
            if (count > 10)
                break;
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }




    }
}
