package practice_5.test2;

public class Electronics extends Item {
    private static final int DEFAULT_WARRANTY = 2;
    private int warranty;

    public Electronics(String name, int stock, double price) {
        super(name, stock, price);
        this.warranty = DEFAULT_WARRANTY;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", warranty: " + getWarranty() + " years");
    }
}
