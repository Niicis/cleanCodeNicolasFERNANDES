public class Execute {

    private static final String _Path = System.getProperty("user.dir") + "\\src\\Library\\LibraryData\\dataBook.txt";

    public static void main(String[] args) {
        App app = new App(_Path);
        app.launchApp();
    }
}