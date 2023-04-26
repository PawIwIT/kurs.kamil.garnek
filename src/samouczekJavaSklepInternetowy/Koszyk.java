package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {
    //dodac przynajmniej getter do listy
    private List<Przedmiot> towaryWKoszyku = new ArrayList<Przedmiot>();
    Scanner scanner = new Scanner(System.in);
    boolean czyKontynuwoacDodawanie = true;

    public void dodajPrzedmiotDoKoszyka(Sklep sklep) {
        System.out.println("Podaj numer towaru");

        while (czyKontynuwoacDodawanie) {
            //TODO Tutaj w petli powinny zostac wyswietlone elementy z mapy ze sklepu.
            //Przyklad
            // id: 1, przedmiot: lopata, cena: 10 zl
            // i reszta przedmiotow z mapy
            System.out.println("0.lopata");
            System.out.println("1.grabie");
            System.out.println("2.ziemia");
            System.out.println("3.donica");
            System.out.println("5.wroc do Menu");

            //uzytkownik wpisuje nr id przedmiotu ktory chce dodac
            int wyborUzytkownika = scanner.nextInt();

            //switch do wywalenia.
            // tutaj powinno byc pobieranie przedmiotu o id=='wyborUzytkownika' z mapy ze sklepu i
            // dodanie tego przedmmiotu list towaryWKoszyku.
            // Na konuc zapytac uzytkownika czy chce dodac jeszcze przedmiot i wtedy odpowiednio ustawic flage 'czyKontynuwoacDodawanie
            switch (wyborUzytkownika) {
                case 0 -> towaryAdd(sklep.map.get(0));
                case 1 -> towaryWKoszyku.add(sklep.map.get(1));
                case 5 -> czyKontynuwoacDodawanie = false;

            }
        }
    }

    public void wyswietlKoszyk() {
        for (Przedmiot przedmiot : towaryWKoszyku) {
            System.out.println(przedmiot);
        }

    }

    public void towaryAdd(Przedmiot przedmiot) {
        towaryWKoszyku.add(przedmiot);
    }
}
