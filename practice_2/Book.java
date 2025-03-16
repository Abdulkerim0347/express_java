package practice_2;

public class Book {
    String author;
    String title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    void setTitle(String newTitle) {
        title = newTitle;
    }

    void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }


    public static void main(String[] args) {
        Book book = new Book("Pushkin","Harry Potter");
        book.setAuthor("J.K.Rowling");

        book.printInfo();
    }
}
