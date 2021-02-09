package Library.LibraryData;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
    private Scanner scannerFile;

    public readFile(String _PathFile) {
        try{
            this.scannerFile = new Scanner(new FileReader(_PathFile));
        }catch (IOException e) { this.errorFile();}
    }

    public void errorFile()
    {
        System.out.println("File not found");
    }

    public String getLine()
    {
        return this.scannerFile.nextLine();
    }

    public boolean hasNextLine()
    {
        return this.scannerFile.hasNext();
    }

}
