package practice_5.test5;

public class Main {
    public static void main(String[] args) {
        Dish steak = new HotDish("steak", 35.0);
        Dish water = new Drink("water",500);

        Menu menu = new Menu();

        menu.serve(steak);
        menu.serve(water);
    }
}
