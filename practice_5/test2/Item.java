package practice_5.test2;

public class Item implements Printable {
    private String name;
    private int stock;
    private double price;

    public Item(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void print() {
        System.out.println("Item: " + getName() + ", in stock: " + getStock() + " left"
                + ", price: " + getPrice());
    }
}
