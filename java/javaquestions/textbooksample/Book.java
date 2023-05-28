package textbooksample;

public class Book {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Book[] myBooks = new Book[3];

        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();

        int x = 0;

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gataby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
