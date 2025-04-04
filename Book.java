public class Book {
    String book_name;
    String author;
    int quantity;

    public Book(String book_name, String author, int quantity) {
        this.book_name = book_name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}
