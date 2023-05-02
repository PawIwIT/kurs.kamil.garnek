package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Koszyk {


    private List<Przedmiot> towaryWKoszyku = new ArrayList<Przedmiot>();

    Scanner scanner = new Scanner(System.in);

    boolean czyKontynuwoacDodawanie = true;

    public void dodajPrzedmiotDoKoszyka(Sklep sklep) throws IllegalAccessException {
        System.out.println("Podaj numer towaru");

        while (czyKontynuwoacDodawanie) {

            for (Map.Entry<Integer, Przedmiot> wyswietlTowarDostepnywSklepie : sklep.getMapaPrzedmiotow().entrySet()) {
                System.out.println("id " + wyswietlTowarDostepnywSklepie);
            }
            System.out.println("Podaj kod towaru, ktory chcesz dodac do koszyka");
            int wyborUzytkownika = scanner.nextInt();
            towaryWKoszyku.add(sklep.getMapaPrzedmiotow().get(wyborUzytkownika));

            if (wyborUzytkownika > sklep.getMapaPrzedmiotow().size()) {

                throw new IllegalAccessException("Nie ma towaru o takim ID");
            }
            if (wyborUzytkownika == -1) {
                czyKontynuwoacDodawanie = false;
            }
        }
    }

    public void usunPrzedmiotzKoszyka(Sklep sklep) {
    }

    public void wyswietlKoszyk() {
        for (Przedmiot przedmiot : towaryWKoszyku) {
            System.out.println(przedmiot);
        }
    }

    public void towaryAdd(Przedmiot przedmiot) {
        towaryWKoszyku.add(przedmiot);
    }

    public void towaryRemove(Przedmiot przedmiot) {
        towaryWKoszyku.remove(przedmiot);
    }

    public void wyswietlCentTowarowwKoszyku() {
        for (Przedmiot przedmiot : towaryWKoszyku) {
            double cena = przedmiot.getCena();

            /*System.out.println(cena);*/


        }

    }
}


