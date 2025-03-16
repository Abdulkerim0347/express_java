package practice_5.test4;

public class Dog extends Pet {
    public Dog(String name, String gender) {
        super(name,gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dry food");
    }

    @Override
    public void play() {
        System.out.println("Dog is walking");
    }
}
