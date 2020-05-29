package сonverter;

import print.edition.*;

public class AbstractPrintEditionConverter {
    public AbstractPrintEdition convert(String type, String stringToConvert, String regex) {
        String[] fields = stringToConvert.split(regex);
        AbstractPrintEdition printEdition = null;
        switch (type) {
            case "book":
                printEdition = new Book(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3]);
                break;
            case "magazine":
                printEdition = new Magazine(fields[0], fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]));
                break;
            case "pupilsBook":
                printEdition = new PupilsBook(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3], fields[4]);
                break;
        }
        return printEdition;
    }
}
