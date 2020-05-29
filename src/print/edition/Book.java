package print.edition;

import java.util.Objects;

public class Book extends AbstractPrintEdition {
    private String genre;

    public Book(String title, String author, Integer editionNumber, String genre) {
        super(title, author, editionNumber);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(genre, book.genre) &&
                super.equals(book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "Book{" +
                "genre='" + genre + '\'' +
                "}";
    }
}
