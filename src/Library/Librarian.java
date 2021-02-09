package Library;

import Library.Library;

public class Librarian
{
    private Library library;

    public Librarian(Library _Library)
    {
        this.setLibrary(_Library);
    }

    private void setLibrary(Library _library) {
        this.library = _library;
    }

    public void addBookToLibrary(String _Title,String _Authors)
    {
        this.library.addBook(new Books(_Title,_Authors));
    }

    public void addBookToLibrary(Books _Books)
    {
        this.library.addBook(_Books);
    }

    public void seeContentOfLibrary() {
        this.library.showAllBooks();
    }
}
