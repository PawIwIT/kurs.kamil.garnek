package kamilBrzezinskiWydatki;

import java.util.Scanner;

public class WydatkiAplikacja {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ManagerWydatkow managerWydatkow = new ManagerWydatkow();

        while (true) {
            System.out.println("1.wyswietl wszystkie wydatki");
            System.out.println("2.wyswietl wydatki z wybranego miesiaca");
            System.out.println("3.dodaj wydatek");
            System.out.println("4.zakoncz aplikacje");
            System.out.println("wybierz opcje: ");

            int wybor = Integer.parseInt(scanner.nextLine());// nextint nie bierze pod uwage znaku konca lini

            switch (wybor) {
                case 1 -> managerWydatkow.wyswietlWysztkieWydatki();
                case 2 -> System.out.println("2.wyswietl wydatki z wybranego miesiaca");
                case 3 -> System.out.println("3.dodaj wydatek");
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }


        }

    }
}
