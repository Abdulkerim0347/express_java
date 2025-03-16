package practice_7.library;

import practice_7.library.exceptions.BookNotFoundException;
import practice_7.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Such book already exists in library!");
        } else {
            books.add(book);
        }
    }

    public Book searchBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name) {
                foundBook.set(book);
            }
        });
        if (foundBook.get() == null) {
            throw new BookNotFoundException("Book " + name + " not found");
        }

        return foundBook.get();
    }
}
