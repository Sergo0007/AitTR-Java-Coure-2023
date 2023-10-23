package homework.book.model;

//fields
public class Book {
    private String title;
    private String author;
    private int yearsPublished;
    private String isbn;

    //constructor
    public Book(String title, String author, int yearsPublished, String isbn) {
        this.title = title;
        this.author = author;
        this.yearsPublished = yearsPublished;
        this.isbn = isbn;
    }

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearsPublished() {
        return yearsPublished;
    }

    public void setYearsPublished(int yearsPublished) {
        this.yearsPublished = yearsPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title: " + title +
                ", author: " + author +
                ", yearsPublished: " + yearsPublished + ", isbn: " + isbn;
    }

    public void display() {
        System.out.println("Book: " + "Title: " + title + ", Author: " + author + ", Year published: "
                + yearsPublished + ", ISBN: " + isbn);
    }
}

