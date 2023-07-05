package javaStartWyjatki.lekcja1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tab[] = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        System.out.println("Podaj index tablicy ktora chcesz zobaczyc");
        index = scanner.nextInt();

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr - wielkosc tablicy to :" + tab.length);
        }
    }
}
