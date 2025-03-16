package practice_5.test7;

public class Library {

    public Library() {
        System.out.println("New library is created!");
    }

    public void issueBook(Book book, Reader reader) {
        if (book.copies > 0) {
            System.out.println(book.getTitle() + " is issued to " + reader.getName());
            book.copies--;
        }
        else
            System.out.println(book.getTitle() + " is unavailable!");
        }

    public void returnBook(Book book, Reader reader) {
        System.out.println(book.getTitle() + " is returned by " + reader.getName());
        book.copies++;
    }
}
