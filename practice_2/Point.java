package practice_2;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


    public static void main(String[] args) {
        Point obj = new Point(3,5);
        obj.setX(10);

        obj.print();
    }
}
