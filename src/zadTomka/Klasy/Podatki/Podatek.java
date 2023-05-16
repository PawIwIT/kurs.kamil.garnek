package zadTomka.Klasy.Podatki;

import java.util.Scanner;


    //	Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
//	Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
//	Podatek obliczany jest wg. następujących reguł:
//	• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//	• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
    public class Podatek {
        public static void main(String[] args) {
            System.out.println("Wpisz dochod jaki osiagnales w roku 2022");
            Scanner scanner = new Scanner(System.in);
            double dochodUzytkownia = scanner.nextDouble();

            if (dochodUzytkownia > 85.528) {
                double kwota = (dochodUzytkownia * 0.18) - 556.02;
                System.out.println("Twoj podatek wynosi " + kwota);
            } else if (dochodUzytkownia < 85.528) {
                double kwota2 = 14839.02 + (dochodUzytkownia - 85.528) * 0.32;
                System.out.println("Twoj podatek wynosi " + kwota2);
            }
        }
    }
