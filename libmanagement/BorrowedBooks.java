
public class BorrowedBooks {
    Member member;
    Copy copy;
    String dueDate;
    
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void BorrowCopy(Member member, Book book, Copy copy){
        if(copy.getStatus() == "available" && book.copies.contains(copy)){
            book.copies.remove(copy);
            copy.setStatus("borrowed");    
            setDueDate(dueDate);
        }else{
            System.out.println("book is not available");
        }
    }
    
    public void returnCopy(Member member, Copy copy, Book book){
        if(copy.getStatus() == "borrowed"){
            book.copies.add(copy);
            book.removeCopies(copy);
            member.booksBorrowed.remove(book);
            copy.setStatus("available");
        }
    }

}
