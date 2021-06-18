import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> listaKsiazek = new ArrayList<>();

    public void add(Book book){

        listaKsiazek.add(book);

    }

    public void remove(Book book){

        listaKsiazek.remove(book);

    }

    public List<Book> znajdzWszystkie(){
        return listaKsiazek;
    }

    public List<Book> znajdzGatunki(Book.Gatunek gatunek){
        List<Book> wybraneKsiazki = new ArrayList<>();
        for(Book book : listaKsiazek){
            if(book.getGatunek().equals(gatunek)){ wybraneKsiazki.add(book);
            }
        }
        return wybraneKsiazki;
    }

    public List<Book> znajdzPrzed(int rok){
        List<Book> wybraneKsiazki = new ArrayList<>();
        for(Book book : listaKsiazek){
            if(book.getRok() < rok){ wybraneKsiazki.add(book);
            }
        }
        return wybraneKsiazki;
    }

    public Book znajdzNajdrozsza(){
        double maxCena = 0.0;
        for(Book book : listaKsiazek){
            if(book.getCena() > maxCena){ maxCena = book.getCena();
            }
        }
        for(Book book : listaKsiazek){
            if(book.getCena() == maxCena){ return book;
            }
        }
        return null;
    }

    public Book znajdzNajtansza(){
        double minCena = Double.MAX_VALUE;
        for(Book book : listaKsiazek){
            if(book.getCena() < minCena){ minCena = book.getCena();
            }
        }
        for(Book book : listaKsiazek){
            if(book.getCena() == minCena){ return book;
            }
        }
        return null;
    }


}

