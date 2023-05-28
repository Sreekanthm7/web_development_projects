import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.add(member);
    }

    public boolean getBookByISBN(String ISBN) {
     for(Book book : books){
        if(book.getISBN() == ISBN){
            return true;
        }
     }
     return false;
  
    }

}
