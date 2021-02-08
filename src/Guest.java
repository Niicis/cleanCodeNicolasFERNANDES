public class Guest
{
    private Library library;

    public Guest(Library _Library)
    {
        this.setLibrary(_Library);
    }

    private void setLibrary(Library _library) {
        this.library = _library;
    }

    void seeContentOfLibrary()
    {
        this.library.showAllBooks();
    }
}
