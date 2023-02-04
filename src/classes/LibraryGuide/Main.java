package classes.LibraryGuide;

public class Main {
    public static void main(String[] args) {
        Author shildt = new Author("Герберт", "Шилдт");
        Author kay = new Author("Адам", "Кей");
        Book thisIsGoingToHurt = new Book(" \"Будет больно\" ", kay, 2017);
        Book javaTheCompleteReference = new Book(" \"Java.Полное руководство.11-е издание\" ", shildt, 2018);
    }
}