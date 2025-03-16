package practice_7.library;

import practice_7.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "Orwell"));
        library.addBook(new Book("Atomic habits", "James Clear"));
        library.addBook(new Book("Martin Eden", "Jack London"));

        try {
            library.searchBook("1994");
        } catch (BookNotFoundException e) {
            System.out.println("Exception caught!");
        }
    }
}
