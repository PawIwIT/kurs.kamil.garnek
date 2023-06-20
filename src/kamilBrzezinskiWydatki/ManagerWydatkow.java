package kamilBrzezinskiWydatki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerWydatkow {

    List<Wydatek> listaWydatkow = new ArrayList<>();


    public void wyswietlWysztkieWydatki() {
        listaWydatkow.forEach(ManagerWydatkow::opisWydatku);
    }

    private static void opisWydatku(Wydatek wydatek) {
        System.out.println(wydatek.getOpisWydatku());
        System.out.println(wydatek.getTyp());
        System.out.println(wydatek.getWartosc());
        System.out.println(wydatek.getMiesiac());
    }

    public void dodajWydatek(Scanner scanner) {
        System.out.println("Jaki wydatek chcesz dodac?");
        String opisWydatku = scanner.nextLine();
        System.out.println("Jakiego tyu jest to wydatek?");
        String typWydatku = scanner.nextLine();
        System.out.println("ile to kosztowalo?");
        double cena = Double.parseDouble(scanner.nextLine());
        System.out.println("z ktorego miesiaca to wydatek");
        int miesiacWydatku = Integer.parseInt(scanner.nextLine());

        Wydatek wydatek = new Wydatek(typWydatku, miesiacWydatku, cena, opisWydatku);
        listaWydatkow.add(wydatek);
    }

    public void wyswietlWydatkizWybranegoMiesiaca(Scanner scanner) {
        System.out.println("z ktorego meisiaca wydatki chcesz wyswietlic?");
        int numerMiesiacaWydatkow = Integer.parseInt(scanner.nextLine());

        listaWydatkow.stream()
                .filter(wydatek -> wydatek.getMiesiac() == numerMiesiacaWydatkow)
                .forEach(ManagerWydatkow::opisWydatku);

    }

}
