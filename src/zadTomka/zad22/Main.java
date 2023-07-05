package zadTomka.zad22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//32.	Zadanie 22: wyswietla dzielniki liczby
//    Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita: ");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();

        List<Integer> listadzielnikow = new ArrayList<>();

        for (int i = 1; i <= podanaLiczba; i++) {
            if (podanaLiczba % i == 0) {
                listadzielnikow.add(i);
                System.out.println("dzielniki z " + podanaLiczba + " to: " + listadzielnikow );
            }
        }
    }
}
