package practice_5.test4;

public class Cat extends Pet {
    public Cat(String name, String gender) {
        super(name, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats wet food");
    }


    @Override
    public void play() {
        System.out.println("Cat plays");
    }
}
