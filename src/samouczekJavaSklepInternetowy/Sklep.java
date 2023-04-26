package samouczekJavaSklepInternetowy;

import java.util.HashMap;
import java.util.Map;

public class Sklep {

    private Map<Integer, Przedmiot> mapaPrzedmiotow = new HashMap<>();

    public void przygotujTowary() {

        getMapaPrzedmiotow().put(0, new Przedmiot("lopata", 10));
        getMapaPrzedmiotow().put(1, new Przedmiot("grabie", 5));
        getMapaPrzedmiotow().put(2, new Przedmiot("ziemia", 3));
        getMapaPrzedmiotow().put(3, new Przedmiot("donica", 35));

    }

    public void wyswietlTowary() {
        for (Map.Entry<Integer, Przedmiot> wyswietlTowarDostepnywSklepie : getMapaPrzedmiotow().entrySet()) {
            System.out.println(wyswietlTowarDostepnywSklepie);
        }
    }

    public void setMapaPrzedmiotow(Map<Integer, Przedmiot> mapaPrzedmiotow) {
        this.mapaPrzedmiotow = mapaPrzedmiotow;
    }

    public Map<Integer, Przedmiot> getMapaPrzedmiotow() {
        return mapaPrzedmiotow;
    }
}






