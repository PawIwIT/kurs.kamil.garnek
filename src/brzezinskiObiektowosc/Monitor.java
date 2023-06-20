package brzezinskiObiektowosc;

public class Monitor {
    private int szerokosc = 3840;
    private int wysokosc = 1920;


    public void malaRozdzielczosc() {
        szerokosc = 800;
        wysokosc = 600;
    }

    public void duzaRozdzielczosc() {
        szerokosc = 3840;
        wysokosc = 1920;
    }

    public String aktualnaRozdzielczosc() {
        return szerokosc + "x" + wysokosc;

    }
}
