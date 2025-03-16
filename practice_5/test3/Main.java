package practice_5.test3;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("bird");
        Animal elephant = new Elephant("elephant");

        Zoo myZoo = new Zoo();

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(bird);

        myZoo.showAnimal(elephant);
        myZoo.showAnimal(bird);
    }
}
