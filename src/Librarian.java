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

    public void addReferenceBook(String _Reference,Books _Book)
    {
        _Book.addReference(_Reference);
    }

    public void addBookToLibrary(Books _Book)
    {
        this.library.addBook(_Book);
    }
}
