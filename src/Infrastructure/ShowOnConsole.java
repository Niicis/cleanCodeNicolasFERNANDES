package Infrastructure;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ShowOnConsole {
    private Scanner currentUserChoice;

    public ShowOnConsole()
    {
        this.currentUserChoice = new Scanner(System.in);
    }


    public void showChoiceOfUser() {
        System.out.println("Are you a Librarian, member or guest ?");
    }

    public void showChoiceOfMember() {
        System.out.println("\n1 - Did you want to see all books in library ?");
        System.out.println("2 - Did you want to see all your borrowed book ?");
        System.out.println("3 - Did you want to borrow a books in library ?");
        System.out.println("4 - Did you want to return one of your books ?");
        System.out.println("5 - Did you want to leave our library ?\n");
    }

    public void showChoiceOfGuest() {
        System.out.println("\n1 - Did you want to see all books in library ?");
        System.out.println("2 - Did you want to leave our library ?\n");
    }

    public String choseUser()
    {
        return this.currentUserChoice.next().toUpperCase(Locale.ROOT);
    }

    public String choseOption() { return this.currentUserChoice.next(); }

    public void quitMessage() {
        System.out.println("Thanks you");
    }

    public int choseMemberIndexBook() {
            try{
                return this.currentUserChoice.nextInt();
            }catch (InputMismatchException e)
            {
               return -1;
            }
    }

    public void errorUserNumber() {
        System.out.println("Pls next time select a number in the list");
    }

    public int choseMemberIndexBorrowedBook() {
        System.out.println("Which one do you want to borrow, select a number");
        return this.choseMemberIndexBook();
    }

    public int choseMemberIndexReturnedBook() {
        System.out.println("Which one do you want to return, select a number");
        return this.choseMemberIndexBook();
    }

    public void showChoiceLibrarian() {
        System.out.println("\n1 - Did you want to see all books in library ?");
        System.out.println("2 - Did you want to add a book ?");
        System.out.println("3 - Did you want to leave our library ?\n");
    }

    public String askTitle() {
        System.out.println("What's the title of the book ?");
        return this.currentUserChoice.next();
    }

    public String askAuthor() {
        System.out.println("What's the author of the book ?");
        return this.currentUserChoice.next();
    }
}
