package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {


    private List<Przedmiot> towaryWKoszyku = new ArrayList<Przedmiot>();

    Scanner scanner = new Scanner(System.in);

    boolean czyKontynuwoacDodawanie = true;

    public void dodajPrzedmiotDoKoszyka(Sklep sklep) {
        System.out.println("Podaj numer towaru");

        while (czyKontynuwoacDodawanie) {
            System.out.println("0.lopata");
            System.out.println("1.grabie");
            System.out.println("2.ziemia");
            System.out.println("3.donica");
            System.out.println("5.wroc do Menu");

            int wyborUzytkownika = scanner.nextInt();

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
public void towaryAdd(Przedmiot przedmiot){
        towaryWKoszyku.add(przedmiot);
}
    }





