package samouczekJavaSklepInternetowy;

import java.util.HashMap;
import java.util.Map;

public class Sklep {

    Map<Integer, Przedmiot> map = new HashMap<>();



    public void przygotujTowary() {

        map.put(0, new Przedmiot("lopata", 10));
        map.put(1, new Przedmiot("grabie", 5));
        map.put(2, new Przedmiot("ziemia", 3));
        map.put(3, new Przedmiot("donica", 35));


    }

    public void wyswietlTowary() {
        for (Map.Entry<Integer, Przedmiot> wyswietlTowarDostepnywSklepie : map.entrySet()) {
            System.out.println(wyswietlTowarDostepnywSklepie);
        }


    }

    public void setMap(Map<Integer, Przedmiot> map) {
        this.map = map;
    }

    public Map<Integer, Przedmiot> getMap() {
        return map;
    }
}






