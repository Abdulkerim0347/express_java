package practice_6.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    public void addOrder(String order) {
        orders.addLast(order);
    }

    public void cancelOrder(String order) {
        orders.remove(order);
    }

    public String processOrder() {
        return orders.poll();
    }

    public void printOrders() {
        System.out.println("All orders:");
        orders.forEach(System.out::println);
        System.out.println("--------------");
    }
}
