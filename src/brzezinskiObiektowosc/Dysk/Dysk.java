package brzezinskiObiektowosc.Dysk;

import brzezinskiObiektowosc.Pliki;

public interface Dysk {

     void dodawaniePliku(Pliki pliki);
     void listaPlikow();

     Pliki znajdzPlik(String name);
}
