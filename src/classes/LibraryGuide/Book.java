package classes.LibraryGuide;

import java.time.LocalDate;

public class Book {
   int currentYear = LocalDate.now().getYear();
    private String name;
    private Author author;
    private int publicationYear;

    Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear <= currentYear) {
            this.publicationYear = publicationYear;
        } else {
            System.out.println("Указанный год еще не наступил," +
                    " введите корректный год публикации");
        }
    }
}
