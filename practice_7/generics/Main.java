package practice_7.generics;

public class Main {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>();
//        stringBox.setElement("String");
//        System.out.println(stringBox.getElement());
//
//        Box<Integer> integerBox = new Box<>();
//        integerBox.setElement(1);
//        System.out.println(integerBox.getElement());

        Box<Book> bookBox = new Box<>();
        bookBox.setElement(new Book("1984"));
        System.out.println(bookBox.getElement());

        Box<Magazine> magazineBox = new Box<>();
        magazineBox.setElement(new Magazine("Forbes"));
        System.out.println(magazineBox.getElement());
    }
}
