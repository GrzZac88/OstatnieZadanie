public class Author {

    private String imie;
    private String nazwisko;
    private String plec;

    public Author(String imie, String nazwisko, String plec){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }


    public String getImie() {
        return imie; }

    public String getNazwisko() {
        return nazwisko; }

    public String getPlec() {
        return  plec; }


    public void setImie(String noweImie) {
        this.imie = noweImie; }

    public void setNazwisko(String noweNazwisko) {
        this.nazwisko = noweNazwisko; }

    public void setPlec(String nowaPlec) {
        this.plec = nowaPlec; }

    @Override
    public String toString(){

        String output = "";
        output += "Imie = " + imie + '\n';
        output += "Nazwisko = " + nazwisko + '\n';
        output += "Plec = " + plec + '\n';
        return output;
    }
}


