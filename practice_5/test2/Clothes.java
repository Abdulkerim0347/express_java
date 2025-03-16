package practice_5.test2;

public class Clothes extends Item {
    private final static char DEFAULT_SIZE = 'M';
    private char size;

    public Clothes(String name, int inStock, double price) {
        super(name, inStock, price);
        this.size = DEFAULT_SIZE;
    }


    public char getSize() {
        return size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", size: " + getSize());
    }
}
