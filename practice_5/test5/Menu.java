package practice_5.test5;

public class Menu {

    public void addDish(Dish dish) {
        System.out.println(dish.getName() + " is added to menu");
    }

    public void dishDescription(Dish dish) {
        dish.description();
    }

    public void serve(Dish dish) {
        dish.serve();
    }

}
