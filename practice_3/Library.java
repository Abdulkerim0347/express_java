package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public Library(String bookTitle, String author, int year, String category) {
        this.category = category;
        this.author = author;
        this.year = year;
        this.bookTitle = bookTitle;
    }

    String getBookTitle() {
        return bookTitle;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    String getCategory() {
        return category;
    }

    void setBookTitle(String newBookTitle) {
        bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    void setYear(int newYear) {
        year = newYear;
    }

    void setCategory(String newCategory) {
        category = newCategory;
    }


}
