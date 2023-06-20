package brzezinskiObiektowosc;

import brzezinskiObiektowosc.Dysk.HDDDysk;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //     SSDDysk dysk = new SSDDysk();
        HDDDysk dysk = new HDDDysk();

        Komputer komputer = new Komputer(monitor, dysk);

        dysk.dodawaniePliku(new Pliki("jnsp.jpg"));
        dysk.listaPlikow();
    }
}