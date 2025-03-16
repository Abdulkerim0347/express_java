package practice_6.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addOrder("Pizza");
        manager.addOrder("Sushi");
        manager.addOrder("Somsa");

        manager.printOrders();
        manager.processOrder();
        manager.processOrder();
        manager.printOrders();

    }
}
