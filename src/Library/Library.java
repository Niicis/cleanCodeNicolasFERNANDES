package Library;

import Library.LibraryData.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Library
{
    private ArrayList<Books> allBooks;
    private readFile fileWithBook;

    public Library(String _PathLibrary)  {
        this.allBooks = new ArrayList<>();
        this.fileWithBook = new readFile(_PathLibrary);
        this.initialiseLibrary();
    }

    private void initialiseLibrary() {
        while(fileWithBook.hasNextLine())
        {
            String currLine = fileWithBook.getLine();
            String[] splitedLine = currLine.split(",");
            this.addBook(splitedLine[0],splitedLine[1]);
        }
    }

    public void addBook(Books _Book) {
        allBooks.add(_Book);
    }

    public void addBook(String _Title,String _Author) {
        allBooks.add(new Books(_Title,_Author));
    }

    public void showAllBooks() {
        int index = 0;
        for (Books _Books: this.allBooks) {
            this.showBook(_Books,index++);
        }
    }
    
    private void showBook(Books _Book,int indexOfBook) {
        System.out.println(indexOfBook + " - " + _Book.BookDescription());
    }

    public Books removeBook(int _IndexBook) {
        return this.allBooks.remove(_IndexBook);
    }

}
