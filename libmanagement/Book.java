
import java.util.ArrayList;

public class Book {
    String ISBN;
    String title;
    String author;
    String publisher;
    int publicationDate;

    Book(String ISBN, String title, String author, String publisher, int publicationDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    ArrayList<Copy> copies = new ArrayList<>();

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", publisher=" + publisher
                + ", publicationDate=" + publicationDate + ", copies=" + copies + "]";
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        ISBN = ISBN;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void addCopies(Copy number) {
        copies.add(number);
    }

    public void removeCopies(Copy number) {
        copies.remove(number);
    }

    public int numberOfAvailableCopies() {
       return this.copies.size();
    }

}
