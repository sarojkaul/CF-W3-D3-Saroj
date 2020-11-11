package library;

import java.util.ArrayList;

public class Book {
    private String bookTitle;
    private int bookCapacity;
    private String author;
    private int rentcapacity = 15;

    public Book(String bookTitle,int bookCapacity, String author){
        this.bookTitle = bookTitle;
        this.bookCapacity=bookCapacity;
        this.author=author;
    }
    public String getAuthor() {
        return author;
    }

    public int getBookCapacity() {
        return bookCapacity;
    }
    public String getBookTitle(){
        return bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookCapacity(int bookCapacity) {
        this.bookCapacity = bookCapacity;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookCapacity='" + bookCapacity + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Grass is Always Greener",10,"Jeffrey Archer");
        Book book2 = new Book("A Boy at Seven",5,"John Bidwell");
        Book book3 = new Book("The Open Boat",10,"Stephen Crane");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
            }
}
