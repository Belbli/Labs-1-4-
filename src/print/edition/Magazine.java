package print.edition;

import java.math.BigInteger;
import java.util.Objects;

public class Magazine extends AbstractPrintEdition{
    private Double price;

    public Magazine(String title, String author, Integer editionNumber, Double price) {
        super(title, author, editionNumber);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(price, magazine.price) &&
                super.equals(magazine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "Magazine{" +
                "price=" + price +
                "}";
    }
}
