
public class Main {
    public static void main(String[] args) {
        Member John = new Member("John", 1);

        Book b1 = new Book("lib12331", "Origin of Species", "Charles Darwin", "Darwin", 1859);
        Book b2 = new Book("lib12345", "Anna Karenina", "Leo Tolstoy", "Tolstoy", 1877);
        Book b3 = new Book("lib33225", "Pride and prejudicee", "Jane Austen", "Jane", 1813);

        Copy copyb1 = new Copy(1, "available");
        Copy copy2b1 = new Copy(2, "available");
        Copy copyb2 = new Copy(2, "available");
        Copy copyb3 = new Copy(4, "available");

        Library lib = new Library();

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addMember(John);

        System.out.println(lib.books);
        System.out.println(lib.members);

        System.out.println(lib.getBookByISBN("lib12331"));

        b1.addCopies(copyb1);
        b1.addCopies(copy2b1);
        b2.addCopies(copyb2);
        b3.addCopies(copyb3);

        System.out.println(b1.numberOfAvailableCopies());
        System.out.println(b2.numberOfAvailableCopies());

        BorrowedBooks bb1 = new BorrowedBooks();

        bb1.BorrowCopy(John, b1, copyb1);

        System.out.println(John.numberOfBorrowedBooks());

    }
}
