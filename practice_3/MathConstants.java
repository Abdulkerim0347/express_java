package practice_3;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    static double calcArea(double radius) {
        return PI * radius * radius;
    }

    static double calcCircumference(double radius) {
        return 2 * PI * radius;
    }


    public static void main(String[] args) {
        double result = MathConstants.calcArea(5);
        System.out.println(result);


        System.out.println("Circumference of circle = " + MathConstants.calcCircumference(5));


    }
}
