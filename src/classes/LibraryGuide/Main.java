package classes.LibraryGuide;

public class Main {
    public static void main(String[] args) {
        Author shildt = new Author("Герберт", "Шилдт");
        Author kay = new Author("Адам", "Кей");
        Book thisIsGoingToHurt = new Book(" \"Будет больно\" ", kay, 2017);
        Book javaTheCompleteReference = new Book(" \"Java.Полное руководство.11-е издание\" ", shildt, 2018);

        System.out.println("thisIsGoingToHurt.getName() = " + thisIsGoingToHurt.getPublicationYear());
        System.out.println("thisIsGoingToHurt.getName() = " + thisIsGoingToHurt.getName());
        System.out.println("kay.getName() = " + kay.getName());
        System.out.println("kay.getSurname() = " + kay.getSurname());
        thisIsGoingToHurt.setPublicationYear(2022);
        System.out.println("thisIsGoingToHurt.getPublicationYear() = " + thisIsGoingToHurt.getPublicationYear());
    }
}
