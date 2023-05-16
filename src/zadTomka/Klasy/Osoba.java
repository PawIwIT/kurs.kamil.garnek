package zadTomka.Klasy;

//Napisz klasę Osoba, która będzie zawierała:
//
//Trzy pola: wiek, imie, nazwisko. Użyj odpowiednich typów.
//Trzy metody, w których będziesz ustawiał wartości pól klasy: ustawWiek, ustawImie, ustawNazwisko.
// Argumenty tych metod powinny nazywać się wartoscWieku, imieOsoby, nazwiskoOsoby.
//Metodę toString, która będzie zwracała informacje o imieniu, nazwisko, oraz wieku osoby.
//Metodę main, w której utworzysz jeden obiekt klasy Osoba i nadasz mu wartości za pomocą metod ustawWiek,
// ustawImie, oraz ustawNazwisko, a następnie, za pomocą System.out.println, wypiszesz utworzony obiekt typu Osoba na ekran.


public class Osoba {

    private int wiek;
    private String imie;
    private String naziwsko;
    private Adres adres;
    private final int rokUrodzenia;

    public Osoba(String imie, String naziwsko, Adres adres, int rokUrodzenia) {
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.adres = adres;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void ustawWiek(int wartoscWieku) {
        wiek = wartoscWieku;
    }

    public void ustawImie(String imieOsoby) {
        imie = imieOsoby;
    }

    public void ustawNazwisko(String nazwiskoOsoby) {
        naziwsko = nazwiskoOsoby;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                ", imie='" + imie + '\'' +
                ", naziwsko='" + naziwsko + '\'' +
                ", adres=" + adres +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}




