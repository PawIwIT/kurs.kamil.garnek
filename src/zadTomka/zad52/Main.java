package zadTomka.zad52;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int licznikOsobGlosujacych = 0;
        List<String> imionaOsobGlosujacych = new ArrayList<>();

        Town town = new Town();
        List<Citizen> listaMieszkancow = new ArrayList<>();
        listaMieszkancow.add(0, new Mieszczanin(Statut.MIESZCZANIN, "zenek"));
        listaMieszkancow.add(0, new Mieszczanin(Statut.MIESZCZANIN, "tomek"));
        listaMieszkancow.add(0, new Mieszczanin(Statut.MIESZCZANIN, "pawel"));
        listaMieszkancow.add(0, new Chlop(Statut.CHLOP, "janek"));
        listaMieszkancow.add(0, new Chlop(Statut.CHLOP, "jola"));

        for (Citizen citizen : listaMieszkancow) {
            System.out.println(citizen);
            System.out.println("Moze glosowac : " + citizen.CanVote());
            if (citizen.CanVote()) {
                licznikOsobGlosujacych++;
                System.out.println("Liczba osob ktorzy moga glosowa: " + licznikOsobGlosujacych);
                String imie = citizen.getImie();
                imionaOsobGlosujacych.add(imie);
                System.out.println("imiona osob ktore moga glosowac " + imionaOsobGlosujacych);
            }

        }

    }
}












