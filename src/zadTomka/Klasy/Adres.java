package zadTomka.Klasy;

//Napisz klasę Adres, która będzie miała następujące pola:
//
//miejscowosc typu String,
//kodPocztowy typu String,
//nazwaUlicy typu String,
//nrDomu typu int.
//Do klasy Adres dodaj:
//
//konstruktor, który będzie inicjalizował wszystkie pola obiektów tej klasy,
//metodę toString.

public class Adres {
    private String miejscowosc;
    private String kodPocztowy;
    private String nazwaUlicy;
    private int numerDomu;

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int numerDomu) {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.numerDomu = numerDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miejscowosc='" + miejscowosc + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                ", numerDomu=" + numerDomu +
                '}';
    }
}
