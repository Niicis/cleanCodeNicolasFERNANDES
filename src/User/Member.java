package User;

import Library.Library;
import Library.Books;
import java.util.HashMap;

public class Member
{
    private Books[] borrowedBooks;
    private String[] dateOfBorrowedBook;
    private Library library;

    public Member(Library _Library)
    {
        this.setLibrary(_Library);
        this.borrowedBooks = new Books[3];
        this.dateOfBorrowedBook = new String[3];
    }

    private void setLibrary(Library _Library) {
        this.library = _Library;
    }

    public void borrowBook(int _IndexBook)
    {
        int _freePlace = this.freeIndex();
        switch (_freePlace)
        {
            case 0: this.notEmptyPlaceToBorrow();
                break;
            default:{
                this.borrowedBooks[_freePlace - 1] = this.library.removeBook(_IndexBook);
                this.dateOfBorrowedBook[_freePlace - 1] = "4 weeks remaining";
            }
        }
    }

    private int freeIndex() {
        for(int _index = 1; _index < this.borrowedBooks.length;_index++)
        {
            if(this.borrowedBooks[_index - 1] == null)
                return _index;
        }
        return 0;
    }

    private void notEmptyPlaceToBorrow() {
        System.out.println("You can't borrow a new Book you have already 3 books borrowed\n");
    }

    public Books returnBook(int _IndexOfBook)
    {
        Books returnBook = this.borrowedBooks[_IndexOfBook];
        this.borrowedBooks[_IndexOfBook] = null;
        return returnBook;
    }

    public void showMyBook()
    {
        if(this.isEmpty())
            System.out.println("You don't have any borrowedBooks");

        for(int _index = 0; _index < this.borrowedBooks.length;_index++)
        {
            if (this.borrowedBooks[_index] != null)
            {
                System.out.println(_index + " - " + showBookAndDate(_index));
            }
        }
    }

    private boolean isEmpty() {
        for(int _index = 0; _index < this.borrowedBooks.length;_index++)
        {
            if(this.borrowedBooks[_index] != null)
                return false;
        }
        return true;
    }

    private String showBookAndDate(int _index)
    {
        return this.borrowedBooks[_index].BookDescription() + " - " + this.dateOfBorrowedBook[_index];
    }

    public void seeContentOfLibrary() {
        this.library.showAllBooks();
    }

    public void addBook(Books returnBook) {
        this.library.addBook(returnBook);
    }
}
