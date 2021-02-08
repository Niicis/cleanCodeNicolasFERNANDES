import Library.Library;

public class Execute {

    public static void main(String[] args) {
        Library l = new Library("nn");
        l.addBook(new Books("rr","rr"));
        l.showAllBooks();
        Member m = new Member(l);
        m.borrowBook(0);

        l.showAllBooks();
    }
}
