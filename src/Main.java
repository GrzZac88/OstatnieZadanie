import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        // Pierwsze

        Book ksiazka1 = new Book("Hobbit, czyli tam i z powrotem", 20.50, 1937,
                List.of(new Author("J.R.R.", "Tolkien", "Mezczyzna")), Book.Gatunek.Fantasy);

        Book ksiazka2 = new Book("Do Swiatla", 30.50, 2010,
                List.of(new Author("Andriej", "Diakow", "Mezczyzna")), Book.Gatunek.Przygoda);


        BookService bookService = new BookService();
        bookService.add(ksiazka1);
        bookService.add(ksiazka2);

        System.out.println("Wszystkie ksiazki \n");
        System.out.println(bookService.znajdzWszystkie());

        System.out.println("Fantasy \n");
        System.out.println(bookService.znajdzGatunki(Book.Gatunek.Fantasy));

        System.out.println("Przed 1999 \n");
        System.out.println(bookService.znajdzPrzed(1999));

        System.out.println("Najdrozsza \n");
        System.out.println(bookService.znajdzNajdrozsza());

        System.out.println("Najtansza \n");
        System.out.println(bookService.znajdzNajtansza());

        System.out.println("Przed usunieciem \n");
        System.out.println("Ilosc ksiazek: " + bookService.znajdzWszystkie().size());

        bookService.remove(ksiazka1);
        System.out.println("Po usunieciu \n");
        System.out.println("Ilosc ksiazek: " + bookService.znajdzWszystkie().size());

        // Drugie

        final int MIN_ILOSC = 0;
        final int MAX_ILOSC = 50;


        List<Integer> elementy = new ArrayList();
        for(int i = 0; i < 100; i++){
            elementy.add(ThreadLocalRandom.current().nextInt(MIN_ILOSC, MAX_ILOSC + 1));
        }

        System.out.println("100 elementów z 0-50");
        System.out.println(elementy);

        System.out.println("Unikalne elementy");
        System.out.println(unikalne(elementy));

        System.out.println("Powtórki w elementach");
        System.out.println(powielone(elementy));

    }

    public static List<Integer> unikalne(List<Integer> intList){

        Set<Integer> uniqueValues = new HashSet(intList);
        return new ArrayList(uniqueValues);
    }

    public static List<Integer> powielone(List<Integer> intList){

        List<Integer> powielone = new ArrayList();
        List<Integer> values  = unikalne(intList);
        for(Integer value : values){
            int counter = 0;
            for(Integer element : intList){
                if(element.equals(value))
                    counter++;
            }
            if(counter>1)
                powielone.add(value);
        }
        return powielone;
    }


}
