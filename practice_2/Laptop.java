package practice_2;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void  setBrand(String brand) {
        this.brand = brand;
    }

    void printInfo() {
        System.out.println("Laptop: " + brand + ", price: " + price + "$");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("acer", 1000);
        laptop.setPrice(700);

        laptop.printInfo();
    }
}
