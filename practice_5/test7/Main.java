package practice_5.test7;


public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("Martin Eden", 1);
        Reader john = new Reader("John");

        myLibrary.issueBook(book1, john);
        System.out.println(book1.getCopies());

        myLibrary.returnBook(book1,john);
        System.out.println(book1.getCopies());

    }
}
