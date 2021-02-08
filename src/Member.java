public class Member
{
    private Books[] borrowedBooks;
    private Library library;

    public Member(Library _Library)
    {
        this.borrowedBooks = new Books[3];
        this.setLibrary(_Library);
    }

    private void setLibrary(Library _Library) {
        this.library = _Library;
    }


}
