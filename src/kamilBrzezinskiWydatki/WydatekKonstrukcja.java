package kamilBrzezinskiWydatki;

public class WydatekKonstrukcja {
    private String typ;
    private int miesiac;
    private double wartosc;
    private String opisWydatku;

    public WydatekKonstrukcja(String typ, int miesiac, double wartosc, String opisWydatku) {
        this.typ = typ;
        this.miesiac = miesiac;
        this.wartosc = wartosc;
        this.opisWydatku = opisWydatku;
    }

    public String getTyp() {
        return typ;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public double getWartosc() {
        return wartosc;
    }

    public String getOpisWydatku() {
        return opisWydatku;
    }
}
