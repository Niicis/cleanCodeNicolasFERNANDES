import java.util.ArrayList;

public class Library
{
    private ArrayList<Books> allBooks;

    public Library() {
        this.allBooks = new ArrayList<>();
    }

    public void addBook(Books book) {
        allBooks.add(book);
    }


    public void showAllBooks() {
        for (Books _Books: this.allBooks) {
            this.showBook(_Books);
        }
    }
    
    private void showBook(Books _Books)
    {
        System.out.println(_Books.BookDescription());
    }

    private void removeBook(Books _Books)
    {
        this.allBooks.remove(_Books);
    }
}
