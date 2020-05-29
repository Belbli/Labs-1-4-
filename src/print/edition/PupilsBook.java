package print.edition;

import java.util.Objects;

public class PupilsBook extends Book {
    private String subjectName;

    public PupilsBook(String title, String author, Integer editionNumber, String genre, String subjectName) {
        super(title, author, editionNumber, genre);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PupilsBook that = (PupilsBook) o;
        return Objects.equals(subjectName, that.subjectName) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjectName);
    }

    @Override
    public String toString() {
        return super.toString() + "PupilsBook{" +
                "subjectName='" + subjectName + '\'' +
                "}";
    }
}
