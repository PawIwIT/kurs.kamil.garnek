package brzezinskiObiektowosc.Dysk;

import brzezinskiObiektowosc.Pliki;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDysk implements Dysk {
    List<Pliki> plikiHDD = new ArrayList<>();


    @Override
    public void dodawaniePliku(Pliki pliki) {
        plikiHDD.add(pliki);
    }

    @Override
    public void listaPlikow() {

        for (Pliki pliki : plikiHDD) {
            System.out.println(pliki.getNazwa());
        }

    }

    @Override
    public Pliki znajdzPlik(String name) {
        Optional<Pliki> znajdzPlik = plikiHDD.stream()
                .filter(pliki -> pliki.getNazwa().equals(name))
                .findFirst();

        return znajdzPlik.orElseThrow();

    }
}
