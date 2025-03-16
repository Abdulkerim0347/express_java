package practice_5.test3;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird flies!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps!");
    }
}
