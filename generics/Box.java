package generics;

public class Box<T extends Comparable<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Box<Double> box1 = new Box(10);
        Box<Double> box2 = new Box(100);

        System.out.println(box1.compareTo(box2));
    }
}
