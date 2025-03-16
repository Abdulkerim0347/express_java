package practice_5.test4;

public class PetSystem {

    public void addPet(Pet pet) {
        System.out.println(pet.getName() + " added!");
    }

    public void feed(Pet pet) {
        pet.eat();
    }

    public void play(Pet pet) {
        pet.play();
    }

    public void showInfo(Pet pet) {
        System.out.println("Species: " + pet.getName() + ", gender: " + pet.getGender());
    }
}
