package homework;

import java.util.Scanner;

public class Test {

    public static void findMax(int a, int b) {
        int max = b;
        if (a > b) {
            max = a;
        }
        System.out.println("The maximum: " + max);
    }

    public static void grade(int number) {
        if (number == 5) System.out.println("Excellent!");
        if (number == 4) System.out.println("Good");
        if (number == 3) System.out.println("Satisfactory");
        if (number == 2 || number == 1) System.out.println("Unsatisfactory");
    }

    public static void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such day of the week");
        }
    }

    public static void printPlanet(Planets planet) {
        switch (planet) {
            case MERCURY -> System.out.println("Ordinal number from the Sun: 1");
            case VENUS -> System.out.println("ordinal number from the Sun: 2");
            case EARTH -> System.out.println("ordinal number from the Sun: 3");
            case MARS -> System.out.println("ordinal number from the Sun: 4");
            case JUPITER -> System.out.println("ordinal number from the Sun: 5");
            case SATURN -> System.out.println("ordinal number from the Sun: 6");
            case URANUS -> System.out.println("ordinal number from the Sun: 7");
            case NEPTUNE -> System.out.println("ordinal number from the Sun: 8");
        }

    }

    public static double calculator(double a, double b, String sign) {
        double result = 0;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                System.out.println("Non valid math sign!");
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculator(2,30,"*"));

    }
}
