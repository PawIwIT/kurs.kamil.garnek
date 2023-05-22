package zadTomka.kalkulator;

import java.util.List;
import java.util.Scanner;

public class ObliczeniaKalkulatora {
    int liczbaUzytkownika;
    int liczbaUzytkownika2;

    List<String> symbole = List.of("+", "-", "*", "/");
    Scanner scanner = new Scanner(System.in);

    public ObliczeniaKalkulatora() {
    }

    //Testowy konstruktor // Tomek
    public ObliczeniaKalkulatora(int liczbaUzytkownika, int liczbaUzytkownika2) {
        this.liczbaUzytkownika = liczbaUzytkownika;
        this.liczbaUzytkownika2 = liczbaUzytkownika2;
    }

    //Metoda uruchamiajaca wszystkie ponizsze metody //Tomek
    public int uruchomMetodyKalkulatora() {
        wyswietlInformacje();
        pobierzLiczbe();
        return podajSymbolDzialania("+");
    }

    public void wyswietlInformacje() {
        System.out.println("Witaj w aplikacji kalkulator, podaj 2 liczby rzeczywiste dodatnie");
    }

    public void pobierzLiczbe() {

        liczbaUzytkownika = scanner.nextInt();
        liczbaUzytkownika2 = scanner.nextInt();

        if (liczbaUzytkownika == 0) {
            System.out.println("Nie mozna dzielic przez 0");
        }


    }

    public int podajSymbolDzialania(String symbolUzytkownika) {
        System.out.println("Dodawanie : +, odejmowanie: -, mnożenie: * lub dzielenie /");
        symbolUzytkownika = scanner.next();
        switch (symbolUzytkownika) {
            case "+":
                return liczbaUzytkownika + liczbaUzytkownika2;

        }
        return 0;
    }
}

