package User;

import Library.Library;

public class Guest
{
    private Library library;

    public Guest(Library _Library)
    {
        this.setLibrary(_Library);
    }

    private void setLibrary(Library _Library) {
        this.library = _Library;
    }

    public void seeContentOfLibrary()
    {
        this.library.showAllBooks();
    }
}
