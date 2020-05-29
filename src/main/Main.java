package main;

import list.LinkedList;
import print.edition.*;
import сonverter.AbstractPrintEditionConverter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Magazine mag1 = new Magazine("Forbes", "Author1", 123435, 3.66);
        Magazine mag2 = new Magazine("Cooking", "Author2", 213123, 1.46);
        Magazine mag3 = new Magazine("NewsPaper", "Author3", 324324, 0.66);
        Book book1 = new Book("War&Peace", "Tolstoy L.N.", 2341123, "drama");
        Book book2 = new Book("Harry Potter", "J. Rouling", 1231233, "fantasy");
        PupilsBook pupilsBook1 = new PupilsBook("Math", "Authors", 23456231, "science", "Math");
        PupilsBook pupilsBook2 = new PupilsBook("English", "Eminen", 3454234, "science", "English");

        //2 LABA
        List<AbstractPrintEdition> library = Arrays.asList(
                mag1, mag2, mag3, book1, book2, pupilsBook1, pupilsBook2
        );

        Magazine magazineToCompare = new Magazine("Forbes", "Author1", 123435, 3.66);
        System.out.println("Objects created = " + AbstractPrintEdition.objectsCount);
        System.out.println(library);

        System.out.println(library.get(0).equals(magazineToCompare));

        //3 LABA
        LinkedList<AbstractPrintEdition> list = new LinkedList<>();
        list.add(mag1);
        list.add(mag2);
        list.add(mag3);
        list.add(book1);
        list.add(book2);
        list.add(pupilsBook1);
        list.add(pupilsBook2);

        System.out.println();
        System.out.println(list);
        System.out.println(list.sort2(list));

        AbstractPrintEditionConverter converter = new AbstractPrintEditionConverter();
        String type = null;
        Scanner sc = new Scanner(System.in);
        String buff = null;

        System.out.println("Enter type of edition (book, pupils book, magazine): ");
        while (!(type = sc.nextLine()).isEmpty()) {
            System.out.println("Enter information about edition : ");
            buff = sc.nextLine();
            list.add(converter.convert(type, buff, ";"));
            System.out.println("Enter type of edition (book, pupils book, magazine): ");
        }
        //Bookname;Author;12343244;genre
        //Magazine;MAgAuthor;1212414;4.66
        //PupilsBook;PBAuthor;1231234;science;Subject
        System.out.println(list);
    }

}
