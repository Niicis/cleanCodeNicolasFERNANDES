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

    public void addBookToLibrary(Books _Book)
    {
        this.library.addBook(_Book);
    }
}
