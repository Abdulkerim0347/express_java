package practice_5.test3;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Elephant walks!");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }
}
