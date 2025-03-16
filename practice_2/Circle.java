package practice_2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setRadius(7);

        System.out.println("Area: " + circle.calculateArea() + ", Circumference: " + circle.calculateCircumference());
    }
}
