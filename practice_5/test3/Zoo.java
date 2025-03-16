package practice_5.test3;

public class Zoo {
    public void addAnimal(Animal animal) {
        System.out.println(animal.getName() + " added to the zoo");
    }

    public void showAnimal(Animal animal) {
        System.out.println("Species: " + animal.getName());
        animal.makeSound();
        animal.move();
        System.out.println("-----------------");
    }

}
