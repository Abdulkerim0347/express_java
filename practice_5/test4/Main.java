package practice_5.test4;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("cat", "male");
        Pet dog = new Dog("dog", "female");

        PetSystem petSystem = new PetSystem();

        petSystem.showInfo(cat);
        petSystem.showInfo(dog);
    }
}
