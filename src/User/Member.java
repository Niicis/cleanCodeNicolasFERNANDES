package User;

import Library.Library;
import Library.Books;
import java.util.HashMap;

public class Member
{
    private HashMap<Books,String> borrowedBooks;
    private Library library;

    public Member(Library _Library)
    {
        this.setLibrary(_Library);
        borrowedBooks = new HashMap<>();
    }

    private void setLibrary(Library _Library) {
        this.library = _Library;
    }

    public void borrowBook(int _IndexBook)
    {
        if(canRent())
            borrowedBooks.put(this.library.removeBook(_IndexBook),"4 weeks remaining");
        else
            this.notEmptyPlaceToBorrow();

    }

    private void notEmptyPlaceToBorrow() {
        System.out.println("You can borrow a new Book you have already 3 books borrowed");
    }

    public void returnBook(Books _Book)
    {
        this.borrowedBooks.remove(_Book);
    }

    private boolean canRent()
    {
        if (numberOfBorrowedBook() < 3)
            return true;

        return false;
    }

    private int numberOfBorrowedBook()
    {
        return this.borrowedBooks.size();
    }

    public void showMyBook()
    {

    }


}
