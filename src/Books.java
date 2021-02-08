public class Books
{
    private String title;
    private String author;
    private String reference;

    public Books(String _title, String _Author)
    {
        this.setTitle(_title);
        this.setAuthor(_Author);
    }

    private void setAuthor(String _Author) {
        this.author = _Author;
    }

    private void setTitle(String _title) {
        this.title = _title;
    }

    private void setTReference(String _Reference) {
        this.reference = _Reference;
    }

    private String getTitle()
    {
        return this.title;
    }

    private String getAuthor()
    {
        return this.author;
    }

    private String getReference()
    {
        return this.reference;
    }

    public String BookDescription()
    {
        return "Title : " + this.getTitle() + " write by " + this.getAuthor() + " reference : " + this.getReference();
    }

    public void addReference(String _Reference) {
        this.setTReference(_Reference);
    }
}
