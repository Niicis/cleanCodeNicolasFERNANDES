public class test
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Librarian librarian =
                new Librarian(library);

        librarian.addBookToLibrary(
                new Books("Titre 1",
                        "Moi"));
        librarian.addBookToLibrary(
                new Books("Titre 2",
                        "Moi"));
        librarian.addBookToLibrary(
                new Books("Titre 3",
                        "Moi"));
        librarian.addBookToLibrary(
                new Books("Titre 4",
                        "Moi"));

        Guest guest1 = new Guest(library);
        guest1.seeContentOfLibrary();
    }
}
