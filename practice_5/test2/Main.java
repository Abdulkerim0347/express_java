package practice_5.test2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Mug", 15, 300);
        Item camera = new Electronics("Camera", 5, 5000);
        Item shirt = new Clothes("T-shirt", 50,1000);

        Manager manager = new Manager();

        manager.manage(mug);
        manager.manage(camera);
        manager.manage(shirt);

    }
}
