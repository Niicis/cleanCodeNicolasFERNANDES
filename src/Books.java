public class Books
{
    private String title;
    private String author;

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

    private String getTitle()
    {
        return this.title;
    }

    private String getAuthor()
    {
        return this.author;
    }

    public String BookDescription()
    {
        return "Title : " + this.getTitle() + " write by " + this.getAuthor();
    }

}
