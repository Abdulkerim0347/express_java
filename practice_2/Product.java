package practice_2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void applyDiscount(double discount) {
        double discount_price = price * (discount / 100);
        price -= discount_price;
    }

    void printInfo() {
        System.out.println("Product: " + name + ", price: " + price + " rub");
    }

    public static void main(String[] args) {
        Product bread = new Product("bread", 100);
        bread.setPrice(64);
        bread.applyDiscount(15);

        bread.printInfo();
    }
}
