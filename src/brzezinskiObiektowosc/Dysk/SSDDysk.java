package brzezinskiObiektowosc.Dysk;

import brzezinskiObiektowosc.Pliki;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDysk implements Dysk {

    Map<String, Pliki> plikiSSD = new HashMap<>();


    @Override
    public void dodawaniePliku(Pliki pliki) {
        plikiSSD.put(pliki.toString(), pliki);
    }

    @Override
    public void listaPlikow() {
        Collection<Pliki> kolekcjaPlikow = plikiSSD.values();
        for (Pliki pliki : kolekcjaPlikow) {
            System.out.println(pliki.getNazwa());

        }
    }

    @Override
    public Pliki znajdzPlik(String name) {
        return plikiSSD.get(name);
    }
}
