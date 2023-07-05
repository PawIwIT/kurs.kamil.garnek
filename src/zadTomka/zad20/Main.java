package zadTomka.zad20;

import java.util.Scanner;

//20.	Zadanie 10: pobrać wartość i obliczyć podatek
//	Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
//	Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
//	Podatek obliczany jest wg. następujących reguł:
//	• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//	• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
public class Main {
    public static void main(String[] args) {
        double podatekMaly = 85528;
        double wyliczonyPodatek = 0;

        System.out.println("Podaj swoj dochod: ");
        Scanner scanner = new Scanner(System.in);
        double podanyDochod = scanner.nextDouble();

        if (podanyDochod <= podatekMaly) {
            wyliczonyPodatek = (podanyDochod * 0.18) - 556.02;
            System.out.println("Podatek to: " + wyliczonyPodatek + " zl");
        } else {
            wyliczonyPodatek = 14839.02 + ((podanyDochod - 85528) * 0.32);
            System.out.println(wyliczonyPodatek + " zl");
        }

    }

}
