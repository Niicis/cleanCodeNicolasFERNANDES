import Infrastructure.ShowOnConsole;
import Library.Library;
import Library.Librarian;
import User.Guest;
import User.Member;



public class App {
    private static final String _Member  = "MEMBER";
    private static final String _Guest  = "GUEST";
    private static final String _Librarian = "LIBRARIAN";
    private static final String _MemberChoiceSeeAllBookInLibrary  = "1";
    private static final String _MemberChoiceSeeAllBookBorrowed  = "2";
    private static final String _MemberChoiceBorrowABook = "3";
    private static final String _MemberChoiceReturnABook  = "4";
    private static final String _MemberChoiceQuit  = "5";
    private static final String _GuestChoiceSeeAllBook = "1";
    private static final String _GuestChoiceQuit  = "2";

    private static final String _LibrarianSeeAllBook  = "1";
    private static final String _LibrarianAddBook  = "2";
    private static final String _LibrarianQuit  = "3";

    private static final int _ErrorInput = -1;
    private Library currLibrary;
    private Librarian currLibrarian;
    private ShowOnConsole userChoice;

    public App(String path) {
        this.currLibrary = new Library(path);
        this.currLibrarian = new Librarian(this.currLibrary);
        this.userChoice = new ShowOnConsole();
    }

    public void launchApp()
    {
        this.userChoice.showChoiceOfUser();
        switch (this.userChoice.choseUser()) {
        case _Member: {
            String currChoice;
            Member _currMember = new Member(currLibrary);
            do{
                this.userChoice.showChoiceOfMember();
                currChoice = this.userChoice.choseOption();
                optionOfMember(currChoice,_currMember);
            }while (!currChoice.equals(_MemberChoiceQuit));
            break;
        }
        case _Guest: {
            String currChoice;
            Guest _currGuest = new Guest(currLibrary);
            do{
                userChoice.showChoiceOfGuest();
                currChoice = this.userChoice.choseOption();
                optionOfGuest(currChoice,_currGuest);
            }while (!currChoice.equals(_GuestChoiceQuit));
            break;
        }
        case _Librarian: {
            String currChoice;
            do{
                userChoice.showChoiceLibrarian();
                currChoice = userChoice.choseOption();
                optionOfLibrarian(currChoice);
            }while (!currChoice.equals(_LibrarianQuit));
            break;
        }
    }
    userChoice.quitMessage();
}

    private void optionOfLibrarian(String currChoice) {
        switch (currChoice) {
            case _LibrarianSeeAllBook: this.currLibrarian.seeContentOfLibrary();
                break;
            case _LibrarianAddBook: this.currLibrarian.addBookToLibrary(userChoice.askTitle(),userChoice.askAuthor());
                break;
        }
    }


    private void optionOfGuest(String currChoice,Guest _currGuest) {
        switch (currChoice) {
            case _GuestChoiceSeeAllBook: _currGuest.seeContentOfLibrary();
        }
    }

    private void optionOfMember(String currChoice, Member _currMember) {
        switch (currChoice) {
            case _MemberChoiceSeeAllBookInLibrary: _currMember.seeContentOfLibrary();
                break;
            case _MemberChoiceSeeAllBookBorrowed: _currMember.showMyBook();
                break;
            case _MemberChoiceBorrowABook: {
                _currMember.seeContentOfLibrary();
                int _ChosenIndex = this.userChoice.choseMemberIndexBorrowedBook();
                if(_ChosenIndex != _ErrorInput)
                {
                    _currMember.borrowBook(_ChosenIndex);
                    break;
                }
                this.userChoice.errorUserNumber();
                break;
            }
            case _MemberChoiceReturnABook: {
                _currMember.showMyBook();
                int _ChosenIndex = this.userChoice.choseMemberIndexReturnedBook();
                if(_ChosenIndex != _ErrorInput)
                {
                    this.currLibrarian.addBookToLibrary(_currMember.returnBook(_ChosenIndex));
                    break;
                }
                this.userChoice.errorUserNumber();
                break;
            }
        }
    }

}

