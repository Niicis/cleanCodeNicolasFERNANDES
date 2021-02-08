package Library;

import java.io.File;
import java.util.ArrayList;

public class Library
{
    private ArrayList<Books> allBooks;
    private File fileWithbook;

    public Library(String _PathLibrary) {
        this.allBooks = new ArrayList<>();
        this.initialiseLibrary();
        this.fileWithbook = new File(_PathLibrary);
    }

    private void initialiseLibrary() {

    }

    public void addBook(Books _Book) {
        allBooks.add(_Book);
    }

    public void addBook(String _Title,String _Author) {
        allBooks.add(new Books(_Title,_Author));
    }

    public void showAllBooks() {
        for (Books _Books: this.allBooks) {
            this.showBook(_Books);
        }
    }
    
    private void showBook(Books _Book) {
        System.out.println(_Book.BookDescription());
    }

    public Books removeBook(int _IndexBook) {
        return this.allBooks.remove(_IndexBook);
    }

    private int getIndexOfBook(Books _Book) {
        return this.allBooks.indexOf(_Book);
    }

    public Books selectedBook(int indexOfBook) {
        return this.allBooks.get(indexOfBook);
    }
}
