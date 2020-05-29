package print.edition;

import java.util.Objects;

public abstract class AbstractPrintEdition implements AbstratPrintEditionComparable{
    private String title;
    private String author;
    private Integer editionNumber;
    public static Integer objectsCount = 0;

    public AbstractPrintEdition(String title, String author, Integer editionNumber) {
        this.title = title;
        this.author = author;
        this.editionNumber = editionNumber;
        objectsCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(Integer editionNumber) {
        this.editionNumber = editionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPrintEdition that = (AbstractPrintEdition) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(editionNumber, that.editionNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, editionNumber);
    }

    @Override
    public String toString() {
        return "AbstractPrintEdition{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", editionNumber=" + editionNumber +
                '}';
    }

    @Override
    public int compare(AbstractPrintEdition o) {
        if (this.getClass().getName().compareTo(o.getClass().getName()) == 0) {
            return this.getTitle().compareTo(o.getTitle());
        } else {
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
    }
}
