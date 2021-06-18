import java.util.List;

public class Book {
    private String tytul;
    private double cena;
    private int rok;
    private final List<Author> listaAutorow;


    public enum Gatunek {
        Fantasy, Przygoda, ScienceFiction, Romans, Przyrodnicza
    }

    private Enum gatunek;

    public Book(String tytul,
                double cena,
                int rok,
                List<Author> listaAutorow,
                Gatunek gatunek) {
        this.tytul = tytul;
        this.cena = cena;
        this.rok = rok;
        this.listaAutorow = listaAutorow;
        this.gatunek = gatunek;
    }


    public String getTytul() {
        return tytul; }

    public double getCena() {
        return cena; }

    public int getRok() {
        return rok; }

    public List<Author> getListaAutorow() {
        return listaAutorow; }

    public Enum getGatunek() {
        return gatunek; }


    public void setTytul(String nowyTytul) {
        this.tytul = nowyTytul; }

    public void setCena(double nowaCena) {
        this.cena = nowaCena; }

    public void setRok(int nowyRok) {
        this.rok = nowyRok; }

    public void setGatunek(Enum nowyGatunek) {
        this.gatunek = nowyGatunek; }


    @Override

    public String toString(){

        String output = "";
        output += "Tytul ksiazki = " + tytul + '\n';
        output += "Cena = " + cena + '\n';
        output += "Rok wydania = " + rok + '\n';
        output += "Autorzy = " + listaAutorow + '\n';
        output += "Gatunek = " + gatunek + '\n';
        return output;
    }

}
