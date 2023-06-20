package kamilBrzezinskiWydatki;

public class Wydatek {
    private String typ;
    private int miesiac;
    private double wartosc;
    private String opisWydatku;

    public Wydatek(String typ, int miesiac, double wartosc, String opisWydatku) {
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
