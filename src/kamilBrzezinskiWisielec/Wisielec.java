package kamilBrzezinskiWisielec;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {

    List<String> slowa = List.of("samochod", "komputer", "kot", "programowanie");
    String wylosowaneSlowo;
    char[] userWord;
    int zycia = 3;

    public void play() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        wylosowaneSlowo = slowa.get(random.nextInt(slowa.size()));
        userWord = new char[wylosowaneSlowo.length()];
        Arrays.fill(userWord, '_');


        while (!gameEnded()) {
            System.out.println(userWord);
            System.out.println();
            System.out.println("podaj kolejna litere");
            System.out.println("pozostalo zyc " + zycia);
            char litera = scanner.nextLine().charAt(0);

            sprawdzLitere(litera);
        }

        if (zycia == 0) {
            System.out.println("niestety przegrales");

        } else {
            System.out.println("brawo");
        }
        scanner.close();

    }

    private void sprawdzLitere(char litera) {
        boolean znajdzLitere = false;
        for (int i = 0; i < wylosowaneSlowo.length(); i++) {
            if (wylosowaneSlowo.charAt(i) == litera) {
                userWord[i] = litera;
                znajdzLitere = true;
            }
        }
        if (!znajdzLitere) {
            System.out.println("niestety nie ma takiej litery");
            zycia--;
        }
    }

    private boolean gameEnded() {
        return zycia == 0 || wylosowaneSlowo.equals(String.valueOf(userWord));
    }
}